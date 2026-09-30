package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCRUD {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            
            String insertQuery = "INSERT INTO student_details (roll_number, name, course, marks) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setInt(1, 509);
                pstmt.setString(2, "Postiwala Vatsal");
                pstmt.setString(3, "B.Tech CSE");
                pstmt.setInt(4, 88);
                pstmt.executeUpdate();
                System.out.println("1. CREATE: Student record inserted.");
            }

            readStudents(conn);

            String updateQuery = "UPDATE student_details SET marks = ? WHERE roll_number = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setInt(1, 95);
                pstmt.setInt(2, 2607012);
                pstmt.executeUpdate();
                System.out.println("\n3. UPDATE: Student marks updated.");
            }
            
            readStudents(conn);

            String deleteQuery = "DELETE FROM student_details WHERE roll_number = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, 2607012);
                pstmt.executeUpdate();
                System.out.println("\n4. DELETE: Student record deleted.");
            }
            
            readStudents(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readStudents(Connection conn) throws SQLException {
        System.out.println("2. READ: Current Students in Database:");
        String selectQuery = "SELECT * FROM student_details";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {
            
            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                System.out.println("   Roll No: " + rs.getInt("roll_number") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Course: " + rs.getString("course") + 
                                   ", Marks: " + rs.getInt("marks"));
            }
            if (!hasData) System.out.println("   (Table is empty)");
        }
    }
}