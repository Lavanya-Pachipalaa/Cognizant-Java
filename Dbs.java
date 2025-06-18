import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Dbs{
    public static void main(String[] args) {
        String mysqlUrl = "jdbc:mysql://localhost:3306/school";
        String mysqlUser = "root";
        String mysqlPassword = "enteryourpassword";
        String dbUrl = mysqlUrl;
        try (Connection connection = DriverManager.getConnection(dbUrl, mysqlUser, mysqlPassword);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
            System.out.println("Students Data:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                                   ", Name: " + resultSet.getString("name") +
                                   ", Age: " + resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
