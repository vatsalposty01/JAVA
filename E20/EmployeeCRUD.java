package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUD {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            
            String insertQuery1 = "INSERT INTO employees (emp_id, name, department, salary) VALUES (101, 'Amit Sharma', 'IT', 55000.00)";
            stmt.executeUpdate(insertQuery1);
            
            String insertQuery2 = "INSERT INTO employees (emp_id, name, department, salary) VALUES (102, 'Priya Singh', 'HR', 45000.00)";
            stmt.executeUpdate(insertQuery2);
            System.out.println("CREATE: 2 Employees inserted.");

            String updateQuery = "UPDATE employees SET salary = 65000.00 WHERE emp_id = 101";
            stmt.executeUpdate(updateQuery);
            System.out.println("UPDATE: Employee 101 salary updated.");

            String deleteQuery = "DELETE FROM employees WHERE emp_id = 102";
            stmt.executeUpdate(deleteQuery);
            System.out.println("DELETE: Employee 102 deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}