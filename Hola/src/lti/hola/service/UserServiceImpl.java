/**
 * 
 */
package lti.hola.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.repo.UserRepository;
import lti.hola.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	private UserRepository repo;	//Creating object of UserRepository interface

	public UserServiceImpl() {
		repo = new UserRepositoryImpl();	//Instantiating UserRepositoryImpl object with UserRepository interface
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {

		// password encoding: LoginBean
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encoded);

		return repo.authenticate(login);
	}

	@Override
	public boolean validate(ForgetBean forget) {
		
		//Movie encoding: ForgetBean
		Encoder encoder = Base64.getEncoder();
		forget.setMovie(encoder.encodeToString(forget.getMovie().getBytes()));
		return repo.validate(forget);
	}

	@Override
	public boolean changePassword(LoginBean login) {
		//Password encoding: LoginBean
		Encoder encoder = Base64.getEncoder();
		login.setPassword(encoder.encodeToString(login.getPassword().getBytes()));
		return repo.changePassword(login);
	}

	@Override
	public boolean persist(RegisterBean register) {
		//Password encoding: RegisterBean
		Encoder encoder = Base64.getEncoder();
		register.setPassword(encoder.encodeToString(register.getPassword().getBytes()));
		register.setMovie(encoder.encodeToString(register.getMovie().getBytes()));

		return repo.persist(register);
	}

	@Override
	public RegisterBean displayDetails(LoginBean login) {
		return repo.displayDetails(login);
	}

}
