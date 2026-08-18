import java.io.*;

public class FinallyThrowThrows{

    static void checkAge(int age)throws IOException{
        if (age < 18){
            throw new IOException("Age must be above 18");
        }
        System.out.println("Eligible for Voting.");
    }

    public static void main(String a[]){

        try {
            System.out.println("Testing age eligibility...");
            checkAge(15);
            
        } catch (IOException e) {

            System.out.println("Exception: " + e.getMessage());
            
        } finally {

            System.out.println("Finally block executed");
        }
        
        System.out.println("Program End.");
    }
}
