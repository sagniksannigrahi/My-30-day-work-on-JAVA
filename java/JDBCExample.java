import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "username", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
