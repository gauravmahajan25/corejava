package multithreading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadLocalExample {
	


	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
		@Override
		public Connection initialValue() {
			try {
				return DriverManager.getConnection("DB URL");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	};
	
	public static Connection getConnection() {
		return connectionHolder.get();
		}

}
