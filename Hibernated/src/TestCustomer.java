import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class TestCustomer {

	@Test
	public void testSaveCustomer() {
		Session session=HibernateUtil.getSession();
		Transaction txn = session.getTransaction();  //transaction is mandatory to perform DML
		
		try {
			txn.begin(); 					//starting db transaction
			Customer cust= new Customer();
			cust.setCustName("Lili");
			cust.setCreditLimit(5600);
			session.save(cust); 			// saving customer object
			txn.commit(); 					// ending transaction with commit
		} catch (Exception e) {
			txn.rollback();					//transaction failed hence rollback
			e.printStackTrace();
		}
	}
	@Test
	public  void testGetCustomer() {
		Session session = HibernateUtil.getSession();
		
		Customer cust= (Customer) session.get(Customer.class, 1);
		System.out.println("Name :"+cust.getCustName());
	}
}
