package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect1 {

	public static void main(String[] args) {
		//From JDBC 4.0 (Java 6), we can safely remove the Class.forName() statement.
		
		String databaseURL = "jdbc:mysql://localhost:3306/employee?user=root&password=admin";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(databaseURL);
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
