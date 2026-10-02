package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCRUD {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            
            String insertQuery1 = "INSERT INTO student_details (roll_number, name, course, marks) VALUES (2607012, 'Postiwala Vatsal', 'B.Tech CSE', 88)";
            stmt.executeUpdate(insertQuery1);
            
            String insertQuery2 = "INSERT INTO student_details (roll_number, name, course, marks) VALUES (2607013, 'Rahul Kumar', 'B.Tech IT', 75)";
            stmt.executeUpdate(insertQuery2);
            System.out.println("CREATE: 2 Student records inserted.");

            String updateQuery = "UPDATE student_details SET marks = 95 WHERE roll_number = 2607012";
            stmt.executeUpdate(updateQuery);
            System.out.println("UPDATE: Student 2607012 marks updated.");

            String deleteQuery = "DELETE FROM student_details WHERE roll_number = 2607013";
            stmt.executeUpdate(deleteQuery);
            System.out.println("DELETE: Student 2607013 record deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}