/**  “Statement” interface is used to execute a simple SQL statement with no parameters. 
 *    For create, insert, update or delete statement, uses “Statement.executeUpdate(sql)“; 
 *    select query, uses “Statement.executeQuery(sql)“. 
 */


package statement;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/employee";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "admin";
	public static void main(String[] args) {

		try {

			updateRecordIntoDbUserTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void updateRecordIntoDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String updateTableSQL = "UPDATE DBUSER"
				+ " SET USERNAME = 'ragavan' "
				+ " WHERE USER_ID = 1";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(updateTableSQL);

			// execute update SQL stetement
			statement.execute(updateTableSQL);

			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                              DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}