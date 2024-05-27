package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import person.Person;

public class Persondao {
    public void insert(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/notebook?user=username&&password=password");

        CallableStatement call = connection.prepareCall("call saveData(?,?,?)");
        call.setInt(1, person.getPersonId());
        call.setString(2, person.getPersonName());
        call.setInt(3, person.getPersonAge());

        int executeUpdate = call.executeUpdate();
        if (executeUpdate > 0) {
            System.out.println("Insertion successfull");
        } else {
            System.out.println("error");
        }
    }
}
