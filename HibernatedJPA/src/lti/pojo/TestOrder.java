package lti.pojo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestOrder {

	@Test
	public void testSaveOrder() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		
		try {
			txn.begin();
			Order order = new Order();
			order.setOrderDate(new Date());
			order.setAmount(1000);
			order.setPromoCode("ASDF123");
			
			session.save(order);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}
	}
	
}
