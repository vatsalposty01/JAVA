import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String basicSalary = sc.nextLine();

        System.out.print("Enter Bonus Amount: ");
        String bonusAmount = sc.nextLine();

        Integer id = Integer.valueOf(empId);
        Double salary = Double.valueOf(basicSalary);
        Double bonus = Double.valueOf(bonusAmount);

        // Validation
        if (salary <= 0) {
            System.out.println("Invalid Salary! Basic Salary must be greater than 0.");
        } else if (bonus < 0) {
            System.out.println("Invalid Bonus! Bonus cannot be negative.");
        } else {

            double netSalary = salary + bonus;

            System.out.println("\nEmployee Payroll");
            System.out.println("Employee ID: " + id);
            System.out.println("Basic Salary: " + salary);
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}