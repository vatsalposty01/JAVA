import java.io.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }
}

public class EmployeeFile {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ravi", 45000.50);
        Employee emp2 = new Employee(2, "Vatsal", 55000.00);

        try {
            FileWriter writer = new FileWriter("employees.txt");

            writer.write(emp1.id + " - " + emp1.name + " - " + emp1.salary + "\n");
            writer.write(emp2.id + " - " + emp2.name + " - " + emp2.salary + "\n");
            
            writer.close();
            System.out.println("Data written to employees.txt successfully.\n");
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader("employees.txt");
            BufferedReader br = new BufferedReader(reader);
            
            String line;
            System.out.println("Contents of employees.txt:");
            
            // Reading and printing data line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}