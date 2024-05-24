package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/notebook", "root", "icfoss007");

        PreparedStatement statement = connection.prepareStatement("insert into persondetails values(2,'fawezan','25')");
        boolean execute = statement.execute();
        if (execute == false) {
            System.out.println("Inserted");
        } else {
            System.out.println("Error");
        }
        connection.close();
    }
}
