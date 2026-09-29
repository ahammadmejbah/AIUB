import java.sql.*;

public class Test {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", ""); 
            System.out.println("Connected");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student_address");

            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt(1));
                System.out.println("Home No: " + rs.getString(2));
                System.out.println("City: " + rs.getString(3));
            }

        } catch (Exception s) {
            System.out.println(s);
        }
    }
}
