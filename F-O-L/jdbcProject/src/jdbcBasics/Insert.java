package jdbcBasics;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * what are the 5 steps to achieve jdbc
		 * 1.load and register the driver
		 * 2.Establish connection
		 * 3.create statements and execute queries
		 * 4.process the result
		 * 5.close the connection
		 */

		/*
		 * Components used in jdbe
		 * 1. Driver (i)
		 * 2. DreverManager(c)
		 * 3. Connection(i)
		 * 4. statement(i)
		 * 5. ResultSet(i)
		 */

		Driver cj = new com.mysql.cj.jdbc.Driver(); // loading the driver
		DriverManager.registerDriver(cj); // registering the driver

		// Class.forName("com.mysql.cj.jdbc.Driver");

		// Another step of registering and
		// loading the driver in single line

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/notebook", "username",
				"password");

		String query = "insert into persondetails values(2,'fawzan2','23')";
		Statement statement = connection.createStatement(); // create statements and execute queries

		int result = statement.executeUpdate(query); // processing data

		if (result == 1) {
			System.out.println("Query Ok");
		} else {
			System.out.println("Error");
		}

		connection.close(); // Closing connection
	}
}
