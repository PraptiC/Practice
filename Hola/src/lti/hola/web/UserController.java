package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String referer = request.getHeader("referer");
		if (referer.contains("login.jsp")) {
			// Request coming from home for login authentication
			RegisterBean user = LoginController.authenticate(request);
			if(user!=null) {
				//Login Successful
				response.sendRedirect("profile.jsp");
			}
			else {
				//Login Failed
				response.sendRedirect("login.jsp");
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
			response.sendRedirect("forgotPage.jsp");
//			System.out.println("Got requset for forget passwrd");
		} else if(referer.contains("change.jsp")) {
			// Request coming for updating password
			if(LoginController.changePassword(request))
				response.sendRedirect("login.jsp");
			else
				response.sendRedirect("change.jsp");
		}
		else
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// DElegating call to doGet() to perform common logic

		doGet(request, response);// method chaining
	}

}
