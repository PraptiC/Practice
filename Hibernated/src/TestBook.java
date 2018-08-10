import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.util.HibernateUtil;

public class TestBook {
	@Test
	public void testSaveBook() {
		Session session = HibernateUtil.getSession();

		Transaction txn = session.beginTransaction();
		Book kite = new Book(34567, "The Kite Runner", "Khaled Hosseini", 400);
		session.save(kite);
		txn.commit();
	}

	@Test
	public void testGetBook() {
		Session session = HibernateUtil.getSession();
		Book book = (Book) session.get(Book.class, 1);
		System.out.println(book);
	}

	@Test
	public void testGetByIsbn() {
		Session session = HibernateUtil.getSession();
		Book book = (Book) session.bySimpleNaturalId(Book.class).load(34567);
		System.out.println(book);
	}

}
