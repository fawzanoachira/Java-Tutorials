package jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update {
    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username",
                "password");

        Statement statement = connection.createStatement();

        String query = "update persondetails set personname='fawz' where personid=2";
        boolean execute = statement.execute(query);

        if (execute == false) {
            System.out.println("query ok");
        } else {
            System.out.println("error");
        }

        connection.close();
    }
}
