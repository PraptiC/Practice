package lti.hola.repo;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
/**
 * Repository interface for variety of database
 * @author Prapti, Shilpa
 * @version 1.0
 */
public interface UserRepository {
	RegisterBean authenticate(LoginBean login);
	
	boolean validate(ForgetBean forget);
	
	boolean changePassword(LoginBean login);
	
	boolean  persist(RegisterBean register);
	
	RegisterBean display(RegisterBean register);
}
