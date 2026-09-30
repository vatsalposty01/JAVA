package E19;

import java.sql.*;

public class ProductDetails {

    static String url = "jdbc:mysql://localhost:3306/SIT_JAVA";
    static String user = "root";
    static String password = "12345";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");

            System.out.println("ID\tProduct Name\t\tQuantity\tPrice");
            System.out.println("--------------------------------------------------------------");
            
            while (rs.next()) {
                int id = rs.getInt("product_id");
                String name = rs.getString("product_name");
                int qty = rs.getInt("quantity");
                double price = rs.getDouble("price");
                
                System.out.println(id + "\t" + name + "\t" + qty + "\t" + price);
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}