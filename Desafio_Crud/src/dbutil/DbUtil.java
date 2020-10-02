package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	private static Connection connection = null;
	
	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		}else {
			try {
				Properties prop = new Properties();
				
				String user = "root";
				String password = "abcd1234";
				Class.forName("mysql-connector-java-8.0.21");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudaluno", user, password);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
