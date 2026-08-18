import java.io.*;
import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        
        try {
            int amount = scanner.nextInt();

            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient Balance!");
            } else if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero!");
            }
            
            balance = balance - amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: " + balance);

        } catch (IllegalArgumentException e) {
            // Catches the invalid amount error
            System.out.println("Error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter a number.");
        }
        
        scanner.close();
    }
}