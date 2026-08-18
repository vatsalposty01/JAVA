import java.io.*;

public class OnlineShopping {

    void processOrder(int quantity) {
        int pricePerItem = 500;
        
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid Quantity! Quantity must be 1 or more.");
        }
        
        int totalCost = quantity * pricePerItem;
        System.out.println("Success! You ordered " + quantity + " items. Total: " + totalCost);
    }

    public static void main(String[] args) {
        OnlineShopping s = new OnlineShopping();
        
        try {
            System.out.println("\nfirst Order");
            s.processOrder(2); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSecond Order");
        try {
            
            s.processOrder(0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error Caught: " + e.getMessage());
        }
        
        System.out.println("\nProgram ended.");
    }
}