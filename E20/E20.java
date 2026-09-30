package E20;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E20 {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SIT_JAVA";
    private static final String USER = "root";
    private static final String PASS = "12345";

    public static void main(String[] args) {
         
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connection established successfully.");

            String insertQuery = "INSERT INTO products (product_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                insertStmt.setInt(1, 104);
                insertStmt.setString(2, "Gaming Monitor");
                insertStmt.setInt(3, 15);
                insertStmt.setDouble(4, 15500.00);
                
                int rowsInserted = insertStmt.executeUpdate();
                System.out.println(rowsInserted + " record(s) inserted successfully.");
            }

            String updateQuery = "UPDATE products SET quantity = ? WHERE product_id = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                updateStmt.setInt(1, 25);
                updateStmt.setInt(2, 104);
                
                int rowsUpdated = updateStmt.executeUpdate();
                System.out.println(rowsUpdated + " record(s) updated successfully.");
            }

            String deleteQuery = "DELETE FROM products WHERE product_id = ?";
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
                deleteStmt.setInt(1, 103);
                
                int rowsDeleted = deleteStmt.executeUpdate();
                System.out.println(rowsDeleted + " record(s) deleted successfully.");
            }

        } catch (SQLException e) {
            System.err.println("Database connection or execution error!");
            e.printStackTrace();
        }
    }
}