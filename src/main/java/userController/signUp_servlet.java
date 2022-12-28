package userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class singUp
 */
@WebServlet("/signUp")
public class signUp_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/signUp.jsp");
		dispatcher.forward(request, response); 
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = null;
		
		String msg = "";
		
		String id = request.getParameter("user_id");
		String pw =  request.getParameter("user_pw");
		String email = request.getParameter("user_email");
		
		if(id != "") {
			if(UserCheck.checkId(id)) {
				msg = "가입된 아이디 입니다.";
			}else {
				msg= "사용 가능한 아이디 입니다.";
			}
		}else if(email != "") { 
			if(UserCheck.checkMail(email)) {
				msg = "가입된 이메일 입니다.";
				}else{
					msg="사용 가능한 이메일 입니다.";
				}
			
		}else if(email != "" && id != "" && pw != "") {
			if(!UserCheck.checkId(id) && !UserCheck.checkMail(email)){
//			UserManagement.createUser(id, pw, email);
				msg = "회원가입을 완료하였습니다.";
			}
		}
		
		request.setAttribute("id", id);
		request.setAttribute("email", email);
		request.setAttribute("msg", msg);
		dispatcher = request.getRequestDispatcher("WEB-INF/signUp.jsp");
		dispatcher.forward(request, response);
	}
}
