package userController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.DBconnetion;

//가입정보 중복 확인하는 class
public class UserCheck {

	//아이디만 중복 체크
	 static boolean checkId(String id) {
		
		Connection conn = DBconnetion.getConnection();
		String sql="select * from user_tbl where user_id = ?";
		
		try {
		PreparedStatement pstmt = conn.prepareStatement(sql);
						  pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			if(id.equals(rs.getString("user_id"))) {
				return true;
			}
		}

			rs.close();
			pstmt.close();
			conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	//이메일만 중복 체크
	 static boolean checkMail(String email) {
		
		Connection conn = DBconnetion.getConnection();
		String sql="select * from user_tbl where user_email = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
							  pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(email.equals(rs.getString("user_email"))) {
					return true;
				}
			}
			
			
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	//id에 따른 pw 중복 체크 : id에 맞지 않고 pw만 확인하면 id에 매치 되지 않아도 같은 pw가 DB에 있으면 로그인 됨.
	 static boolean checkPw(String id, String pw) {
		
		Connection conn = DBconnetion.getConnection();
		String sql="select * from user_tbl where user_id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(pw.equals(rs.getString("user_pw"))) {
					return true;
				}
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
}
