package userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("signIn.jsp");
		dispatcher.forward(request, response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = null;
		RequestDispatcher dispatcher = null;
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
			if(!UserCheck.checkId(id)) {
				 request.setAttribute("msg", "아이디가 없습니다.");	
				 
			}else if(!UserCheck.checkPw(id, pw)){
				 request.setAttribute("msg", "패스워드가 틀립니다.");
			}else {
				session = request.getSession();
				session.setAttribute("id", id);
				request.setAttribute("msg", id+"님 어서오세요.");
			}
			dispatcher = request.getRequestDispatcher("login_home.jsp");
			dispatcher.forward(request, response);
	}
}
