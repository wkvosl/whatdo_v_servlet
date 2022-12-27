package userController;

import java.sql.Connection;
import java.sql.PreparedStatement;

import database.DBconnetion;

public class UserManagement {

	public static void createUser(String user_id, String user_pw, String user_email) {
		
		Connection conn = DBconnetion.getConnection();
		String sql="insert into user_tbl(user_id, user_pw, user_email, user_joindate) values(?, ?, ?, now())";
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			pstmt.setString(3, user_email);
			pstmt.executeUpdate();
			
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
