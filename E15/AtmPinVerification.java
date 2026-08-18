import java.io.*;
import java.util.Scanner;

public class AtmPinVerification {

    static void verifyPin(int pin) throws Exception {
        int correctPin = 1234;
        
        if (pin != correctPin) {
            throw new Exception("Invalid PIN");
        }
        System.out.println("PIN accepted. Access granted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ATM PIN: ");
        
        try {
            int enteredPin = sc.nextInt();
            verifyPin(enteredPin);
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            
        } finally {
            System.out.println("Verification process has completed.");
            sc.close(); 
        }
    }
}