package userinput;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInputDB {

	public static void main(String[] args) throws SQLException {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		Connection myConn = null;
		PreparedStatement myStmt = null;

		Scanner scanner = null;

		try {
			// 0. read user input from command line: last name, first name and email
			scanner = new Scanner(System.in);

			System.out.print("Enter your Firstname: ");
			String firstname = scanner.nextLine();

			System.out.print("Enter your last name: ");
			String lastname = scanner.nextLine();

			System.out.print("Enter your email: ");
			String email = scanner.nextLine();

			// 1. Get a connection to database
			String url = "jdbc:mysql://localhost/employee";
			String user = "root";
			String password = "admin";

			myConn = DriverManager.getConnection(url, user, password);

			// 2. Create a statement
			String sql = "insert into basicinfo"
					+ " (firstname, lastname, email)" + " values (?, ?, ?)";

			myStmt = myConn.prepareStatement(sql);

			// set parameter values
			myStmt.setString(1, firstname);
			myStmt.setString(2, lastname);
			myStmt.setString(3, email);

			// 3. Execute SQL query
			myStmt.executeUpdate();

			System.out.println("Insert complete.");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}

			if (scanner != null) {
				scanner.close();
			}
		}
	}

}