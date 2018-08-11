package lti.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getSession() {	//achieves getConnection() part of JDBC		
		
		Configuration cfg = new Configuration().configure();
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();	//deprecated method
		return factory.openSession();
	}

}
