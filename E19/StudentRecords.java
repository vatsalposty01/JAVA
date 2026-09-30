package E19;

import java.sql.*;

public class StudentRecords {

    static String url = "jdbc:mysql://localhost:3306/SIT_JAVA";
    static String user = "root";
    static String password = "12345";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("ID\tName\tMarks");
            System.out.println("------------------------");
            
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" + 
                    rs.getString("name") + "\t" + 
                    rs.getInt("marks")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}