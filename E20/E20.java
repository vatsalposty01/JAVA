package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E20 {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345";

    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
             
            System.out.println("Connection established successfully.");

            String insertQuery1 = "INSERT INTO products (product_id, product_name, quantity, price) VALUES (104, 'Gaming Monitor', 15, 15500.00)";
            stmt.executeUpdate(insertQuery1);
            
            String insertQuery2 = "INSERT INTO products (product_id, product_name, quantity, price) VALUES (105, 'Webcam', 30, 2500.00)";
            stmt.executeUpdate(insertQuery2);
            System.out.println("2 records inserted successfully.");

            String updateQuery = "UPDATE products SET quantity = 25 WHERE product_id = 104";
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            System.out.println(rowsUpdated + " record(s) updated successfully.");

            String deleteQuery = "DELETE FROM products WHERE product_id = 105";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println(rowsDeleted + " record(s) deleted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}