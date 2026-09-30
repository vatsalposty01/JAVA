package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUD {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            
            String insertQuery = "INSERT INTO employees (emp_id, name, department, salary) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setInt(1, 101);
                pstmt.setString(2, "Amit Sharma");
                pstmt.setString(3, "IT");
                pstmt.setDouble(4, 55000.00);
                pstmt.executeUpdate();
                System.out.println("1. CREATE: Employee inserted.");
            }

            readEmployees(conn);

            String updateQuery = "UPDATE employees SET salary = ? WHERE emp_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setDouble(1, 65000.00);
                pstmt.setInt(2, 101);
                pstmt.executeUpdate();
                System.out.println("\n3. UPDATE: Employee salary updated.");
            }
            
            readEmployees(conn);

            String deleteQuery = "DELETE FROM employees WHERE emp_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, 101);
                pstmt.executeUpdate();
                System.out.println("\n4. DELETE: Employee deleted.");
            }
            
            readEmployees(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readEmployees(Connection conn) throws SQLException {
        System.out.println("2. READ: Current Employees in Database:");
        String selectQuery = "SELECT * FROM employees";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {
            
            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                System.out.println("   ID: " + rs.getInt("emp_id") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Dept: " + rs.getString("department") + 
                                   ", Salary: " + rs.getDouble("salary"));
            }
            if (!hasData) System.out.println("   (Table is empty)");
        }
    }
}