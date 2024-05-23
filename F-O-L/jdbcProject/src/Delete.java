import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/notebook", "root", "icfoss007");

        Statement statement = connection.createStatement();
        String query = "delete from persondetails where personid=2";

        int executeUpdate = statement.executeUpdate(query);
        if (executeUpdate > 0) {
            System.out.println("Query Ok");
        } else {
            System.out.println("Error");
        }

        connection.close();
    }
}
