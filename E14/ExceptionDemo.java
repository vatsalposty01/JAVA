import java.io.*;

public class ExceptionDemo{
    public static void main(String []a){
        try{
            int arr[]={10,20,30,40};
            try{

                try{

                int result=arr[5];
                System.out.println(result);
            }catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Nested Catch : Array Index Out of Bound:"+e.getMessage());

            }
            
            int num=10/0;
            System.out.println(num);

            }catch(ArithmeticException e){
            System.out.println("Outer Catch : Arithmetic Exception:"+e.getMessage());
            }
            
            }catch(Exception e){
            System.out.println("General Exception:"+e.getMessage());
        }

        System.out.println("program continues..");
    }
}