package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/notebook", "root", "icfoss007");

        PreparedStatement statement = connection.prepareStatement("select * from persondetails");
        ResultSet executeQuery = statement.executeQuery();
        while (executeQuery.next()) {
            System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2) + " " + executeQuery.getInt(3));
        }
        connection.close();
    }
}
