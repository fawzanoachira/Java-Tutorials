package batchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExecutionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/notebook?user=username&&password=password");

        PreparedStatement statement = connection.prepareStatement("insert into persondetails values(?,?,?)");

        statement.setInt(1, 3);
        statement.setString(2, "samplename");
        statement.setInt(3, 10);
        statement.addBatch();
        statement.setInt(1, 4);
        statement.setString(2, "samplename");
        statement.setInt(3, 20);
        statement.addBatch();

        int[] executeBatch = statement.executeBatch();
        for (int i : executeBatch) {
            if (i > 0) {
                System.out.println("inserted successfully");
            } else {
                System.out.println("error");
            }
        }
    }
}
