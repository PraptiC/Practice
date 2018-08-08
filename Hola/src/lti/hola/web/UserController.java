package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String referer = request.getHeader("referer");
		//Getting session from REquest-if session id exists in request header
		//old session object returned otherwise fresh session created
		HttpSession session = request.getSession();
		
		if (referer.contains("login.jsp")) {
			RegisterBean user = LoginController.authenticate(request);
			// Request coming from home for login authentication
				if(user!=null) {
					//Login Successful- keeping logged in user details in session
					session.setAttribute("User", user);
					response.sendRedirect("profile.jsp");
					}
				else {
					//Login Failed
					response.sendRedirect("login.jsp?invalid=yes");
				}
		} 
		
				
		else if (referer.contains("register.jsp")) {
			// Request coming for user registration
			if(RegisterController.registration(request))
				response.sendRedirect("login.jsp");
			else
				response.sendRedirect("register.jsp");
		} 
		
		
		else if (referer.contains("forgotPage.jsp")) {
			// Request coming for validating user for password change
			if(LoginController.forgetPassword(request))
			response.sendRedirect("change.jsp");
			else
			response.sendRedirect("forgotPage.jsp?invalid=yes");
//			System.out.println("Got requset for forget passwrd");
		} 
		
		
		else if(referer.contains("change.jsp")) {
			// Request coming for updating password
			if(LoginController.changePassword(request))
				response.sendRedirect("login.jsp");
			else
				response.sendRedirect("change.jsp");
		}
		else {
			
			//REquset coming for logout-destroying session
			session.invalidate();
			response.sendRedirect("login.jsp");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// DElegating call to doGet() to perform common logic

		doGet(request, response);// method chaining
	}

}
