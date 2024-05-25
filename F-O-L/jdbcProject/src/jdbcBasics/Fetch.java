package jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection connection =
        // DriverManager.getConnection("jdbc:mysql://localhost/notebook", "root",
        // "icfoss007");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/notebook?user=username&&password=yourpassword");

        Statement statement = connection.createStatement();
        String query = "select * from persondetails";

        ResultSet executeQuery = statement.executeQuery(query);

        while (executeQuery.next()) {
            System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2) + " " + executeQuery.getInt(3));
        }

        connection.close();
    }
}
