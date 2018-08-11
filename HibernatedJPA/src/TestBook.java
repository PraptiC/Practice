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
		Book alc = new Book(34564, "The Alchemist", "Paulo", 430);
		session.save(alc);
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
