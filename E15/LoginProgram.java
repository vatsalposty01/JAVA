import java.util.Scanner;

public class LoginProgram {

    static void login(String password) throws Exception {
        if (!password.equals("12345")) {
            throw new Exception("Invalid Password!"); 
        }
        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String userInput = scanner.nextLine();
        
        try {
            login(userInput); 
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            
        } finally {
            System.out.println("process ended.");
            scanner.close();
        }
    }
}