package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DbOperations {

	static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employeesystem";
		String username = "root";
		String password = "";
		Connection c = DriverManager.getConnection(url, username, password);
		return c;
	}

	static void fetch(Connection c) throws SQLException {

		Statement statement = c.createStatement();
		ResultSet result = statement.executeQuery("select * from employee");
		while (result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
		}
	}
	
	static void insert(Connection c, Scanner s) throws SQLException {
		System.out.println("Enter ID: ");
		int id = s.nextInt();
		
		System.out.println("Enter name: ");
		String name=s.next();
		
		System.out.println("Enter surname: ");
		String surname=s.next();

		Statement st = c.createStatement();
		
//		int res = st.executeUpdate("insert into employee value("+id+",'"+name+"','"+surname+"')");
		
		PreparedStatement ps = c.prepareStatement("insert into employee value(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, surname);
		
		int res= ps.executeUpdate();
		
		if(res>0) {
			System.out.println("Employee inserted");
		} else {
			System.out.println("Something went wrong!");
		}
		
	}
	
	static void delete() {
		
	}
	
	static void update() {
		
	}

}

public class FetchDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = DbOperations.getConnection();
		
		boolean isExit=false;
		
		System.out.println("==========Employee management system==========");
		
		while(!isExit) {
			System.out.println("==================");
			System.out.println("Enter your choice");
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Fetch\n5.Exit");
			System.out.println("==================");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				DbOperations.insert(conn, scanner);
				break;
			}
			case 2: {
				DbOperations.update();
				break;
			}
			case 3: {
				DbOperations.delete();
				break;
			}
			case 4: {
				DbOperations.fetch(conn);
				break;
			}
			case 5: {
				System.out.println("Thank you!!");
				System.exit(0);
			}
			default:
				System.out.println("Please enter valid choice");
			}
		}
		
	}

}
