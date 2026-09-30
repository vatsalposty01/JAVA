package E19;

import java.lang.*;
import java.sql.*;

public class E19 {
    
    static String url = "jdbc:mysql://localhost:3306/symbiosis";
    static String user = "root";
    static String password = "12345";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " + 
                    rs.getString("name") + " " + 
                    rs.getInt("marks")
                );
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}