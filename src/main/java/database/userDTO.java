package database;

public class userDTO {

	private String user_index;
	private String user_id;
	private String user_pw;
	private String user_email;
	private String user_joindate;
	
	public String getUser_index() {
		return user_index;
	}
	public void setUser_index(String user_index) {
		this.user_index = user_index;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_joindate() {
		return user_joindate;
	}
	public void setUser_joindate(String user_joindate) {
		this.user_joindate = user_joindate;
	}
	public userDTO(String user_index, String user_id, String user_pw, String user_email, String user_joindate) {
		super();
		this.user_index = user_index;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_email = user_email;
		this.user_joindate = user_joindate;
	}
	
	
	
}
