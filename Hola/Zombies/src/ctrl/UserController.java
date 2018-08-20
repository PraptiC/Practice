package ctrl;

import java.util.Map;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.ForgetBean;
import bean.LoginBean;
import entity.User;
import service.UserService;

@Controller	//Component stereotype
public class UserController {
	
	@Autowired	//Inject UserService reference
	private UserService service;
	
	@RequestMapping("login.do")	//Redirects Login request to the controller
	public String checkLogin(LoginBean login,Map model,HttpSession session)	
	
	/*LoginBean object to access data values, Map model for the prompt message, 
	 *HttpSession for recording the session details*/
	
	{
		User user=service.authenticate(login);	//Return the result of UserService.authenticate() method to user object
		if(user!=null)	//User exists
			{
			session.setAttribute("User", user);
			return "dashboard";		//Redirect to the feed details page
			}
		else
			{
			model.put("Prompt", "User id password incorrect");	//Display error
			return "home";	//Redirect to homepage
			}
	}
	@RequestMapping("forget.do")	//Redirects forget password request to the controller
	public String forgetPass(ForgetBean forget,Map model,HttpSession session)
	{
		if(service.validate(forget)) {	//validates stored email id with entered email id
			session.setAttribute("Id", forget.getUserId());// Binds the Id with session
			return "change";    //Redirects to the change page
		}
		else
		{
			model.put("Invalid", "User id and email incorrect");
			return "forget";    //Redirects to the forget page
		}
		
	}
	
	@RequestMapping("change.do")		//Redirects change password request to the controller
	public String changePass(LoginBean change,Map model,HttpSession session)
	{ change.setUserId((String)session.getAttribute("Id")); 	
		if(service.changePassword(change)) { //
	
			model.put("Prompt", "Password changed succesfully");
			return "home";         //Redirects to the home page
		}
		else
		{
			model.put("Invalid", "Password does not match");
			return "change";		 //Redirects to the change page
		}
	
	}
	@RequestMapping("register.do")			//Redirects register request to the controller
	public String persist(User user,Map model) {
		if(service.persist(user)) {			
			model.put("Prompt", "Thanku for registration");
			return "home";		 //Redirects to the home page
			
		}else
		{
			model.put("Invalid", "user id already exist");
			return "register";		 //Redirects to the register page
		}
	}
	
	@RequestMapping("logout.do")		//Redirects Logout request to the controller
	public String logout(Map model, HttpSession session) {
	
	session.invalidate();  //Invalidating the request
	model.put("Prompt", "logout successful");     //Display successful logout prompt
	return "home";   		 //Redirects to the home page
	
	}
}

