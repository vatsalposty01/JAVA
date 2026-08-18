import java.io.*;
class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}

public class UserDefineDemo{
    static void checkMarks(int marks)throws InvalidMarksException{
        if(marks<0||marks>100){
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }
        System.out.println("Valid Marks:"+marks);
    }

    public static void main(String a[]){

        try{
            checkMarks(110);
        }catch(InvalidMarksException e){
            System.out.println("Exception"+e.getMessage());
        }
        System.out.println("Program Done.");
    }
}