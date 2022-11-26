package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect2 {
	public static void main(String[] args) {
		String databaseURL = "jdbc:mysql://localhost:3306/test";
		Connection conn = null;
		try {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "root123");
			conn = DriverManager.getConnection(databaseURL, props);
			if (conn != null) {
				System.out.println("Connected to the database");
			}
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}
