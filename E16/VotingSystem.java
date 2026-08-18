import java.io.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {
    
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {

            throw new InvalidAgeException("You must be at least 18 years old to vote.");
        }
        System.out.println("You are eligible to vote!");
    }

    public static void main(String[] args) {

        int voterAge1 = 16;
        System.out.println("Checking voter 1 (Age: " + voterAge1 + ")...");
        
        try {
            checkEligibility(voterAge1);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }


        int voterAge2 = 21;
        System.out.println("\nChecking voter 2 (Age: " + voterAge2 + ")...");
        
        try {
            checkEligibility(voterAge2);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}