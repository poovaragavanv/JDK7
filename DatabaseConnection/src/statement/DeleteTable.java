/**  “Statement” interface is used to execute a simple SQL statement with no parameters. 
 *    For create, insert, update or delete statement, uses “Statement.executeUpdate(sql)“; 
 *    select query, uses “Statement.executeQuery(sql)“. 
 */


package statement;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/employee";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "admin";

	public static void main(String[] args) {

		try {

			deleteRecordFromDbUserTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void deleteRecordFromDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String deleteTableSQL = "DELETE DBUSER WHERE USER_ID = 1";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(deleteTableSQL);

			// execute delete SQL statement
			statement.execute(deleteTableSQL);

			System.out.println("Record is deleted from DBUSER table!");

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