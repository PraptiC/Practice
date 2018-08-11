import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class SQLDemo {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
//		String sql = "select * from cust2 where cust_id=10009";
//		SQLQuery query = session.createSQLQuery(sql);
//		
//		Customer cust =  (Customer) query.addEntity(Customer.class).uniqueResult();
//		
//		System.out.println(cust);	//lti.pojo.Customer
//		System.out.println(cust.getCustName()+ "\t"+cust.getCreditLimit());	//fields of the object
		
		
		
		
		
		
//		String sql = "select cust_id, cust_name from cust2";
//		
//		List customers = session.createSQLQuery(sql).list();
//		
//		for (Object c : customers) {
//			Object[] fields = (Object[]) c;
//			System.out.println(fields[0]+"\t"+fields[1]);	}//returns list of object ARRAYS
		
		
		
		
		
		
//		SQLQuery query = (SQLQuery) session.getNamedQuery("getCustNames");
//		
//		query.list().forEach(System.out::println);
		
		session.getNamedQuery("getCustNames").list().forEach(System.out::println);	//Combining upper 2 statements into one
		
			
		}
			
		
		
	}


