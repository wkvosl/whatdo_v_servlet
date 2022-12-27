package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnetion {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
		
			String url ="jdbc:mysql://localhost/schema1_test";
			String id = "root";
			String pw = "a123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
}
