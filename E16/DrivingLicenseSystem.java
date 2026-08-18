class UnderageException extends Exception {
    UnderageException(String message) {
        super(message);
    }
}

public class DrivingLicenseSystem {
    
    static void checkLicenseEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Age is below 18. You are not eligible for a driving license.");
        }
        System.out.println("You are eligible for a driving license!");
    }

    public static void main(String[] args) {

        int applicantAge1 = 15;
        System.out.println("Checking applicant 1 (Age: " + applicantAge1 + ")...");
        
        try {
            checkLicenseEligibility(applicantAge1);
        } catch (UnderageException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int applicantAge2 = 24;
        System.out.println("\nChecking applicant 2 (Age: " + applicantAge2 + ")...");
        
        try {
            checkLicenseEligibility(applicantAge2);
        } catch (UnderageException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}