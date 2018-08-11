import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class HQLDemo {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
//		String hql="from Customer";
//		Query query= session.createQuery(hql);
//		List<Customer> customers = query.list();
//		
//		for(Customer c: customers)
//			System.out.println(c.getCustId()+"\t"+c.getCustName());
		///////////////////////////////
//		List<Customer> customers = session.createQuery("from  Customer where creditLimit>2000").list();
//		
//		for (Customer c: customers)
//			System.out.println(c.getCustId()+"\t"+c.getCustName());
		/////////////////////////////
//		Customer cust = (Customer) session.createQuery("from Customer where custName='Gru'").uniqueResult();
//		
//		System.out.println(cust.getCustId()+"\t"+cust.getCustName());
		//////////////////////////////
//		Query q= session.createQuery("from Customer where custName=:cname");
//		q.setString("cname","Gru");
//		Customer cust= (Customer) q.uniqueResult();
//		
//		System.out.println(cust.getCustId()+"\t"+cust.getCustName());
		
		Query query = session.getNamedQuery("getAllCust");
		for(Customer cust: (List<Customer>)query.list())
			System.out.println(cust.getCustId()+"\t"+cust.getCustName());
	}
}
