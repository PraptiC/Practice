import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import casestudy.pojo.User;
import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class TestCasestudy {
	
	@Test
	public void testSaveUser() {
		
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		try {
			User user = new User();
			
			user.setUserid("prapti");
			user.setPassword("prapti123");
			user.setEmail("prapti@gmail.com");
			
			session.save(user);	// saving customer object
			txn.commit(); 					// ending transaction with commit
		} catch (Exception e) {
			txn.rollback();					//transaction failed hence rollback
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSaveFeed() {}
	
	@Test
	public void testSaveComment() {}
	
	@Test
	public void testGetUser() {
		
		Session session = HibernateUtil.getSession();
		//Transaction txn = session.beginTransaction();
		
		User user= (User) session.get(User.class, "prapti");
		System.out.println("Name :"+user.getEmail());

	}
	
	@Test
	public void testGetFeed() {}
	
	@Test
	public void testGetComment() {}

}
