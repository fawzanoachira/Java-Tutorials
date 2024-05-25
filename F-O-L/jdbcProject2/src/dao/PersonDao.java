package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import person.Person;

public class PersonDao {
    public void insert(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username", "password");
        PreparedStatement statement = connection.prepareStatement("insert into persondetails values(?,?,?)");

        statement.setInt(1, person.getPersonId());
        statement.setString(2, person.getPersonName());
        statement.setInt(3, person.getPersonAge());

        int executeUpdate = statement.executeUpdate();
        if (executeUpdate > 0) {
            System.out.println("Insertion Successfull");
        } else {
            System.out.println("Error");
        }
        connection.close();
    };

    public void delete(Person p) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username", "password");
        PreparedStatement statement = connection.prepareStatement("delete from persondetails where personid=?");
        statement.setInt(1, p.getPersonId());
        int executeUpdate = statement.executeUpdate();
        if (executeUpdate > 0) {
            System.out.println("Deletion successfull");
        } else {
            System.out.println("Error");
        }
        connection.close();
    }

    public void update(Person p) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username", "password");
        PreparedStatement statement = connection
                .prepareStatement("update persondetails set personage=? where personid=?");

        statement.setInt(1, p.getPersonAge());
        statement.setInt(2, p.getPersonId());

        int executeUpdate = statement.executeUpdate();

        if (executeUpdate > 0) {
            System.out.println("Updation Successful");
        } else {
            System.out.println("Error");
        }

        connection.close();
    }

    public void select() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username", "password");
        PreparedStatement statement = connection
                .prepareStatement("select * from persondetails");
        ResultSet executeQuery = statement.executeQuery();

        while (executeQuery.next()) {
            System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2) + " " + executeQuery.getInt(3));
        }
        connection.close();
    }
}
