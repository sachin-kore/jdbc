package sachin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/sachin";
	static String USER = "username";
	static String PASS = "password";

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;

		try{

			Class.forName("com.mysql.jdbc.Driver");


			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);


			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, first, last, age FROM Employees";
			ResultSet rs = stmt.executeQuery(sql);


			while(rs.next()){

				int id  = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");


				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}

			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

}

