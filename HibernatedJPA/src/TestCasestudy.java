import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import casestudy.pojo.Comment;
import casestudy.pojo.Feed;
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
	public void testSaveFeed() {
		
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		try {
			Feed feed = new Feed();
			
			feed.setFeedId(1001);
			feed.setQuestion("How do I go about learning Python?");
			feed.setUserId("prapti");
			feed.setFeedTimestamp(new Date());
			
			session.save(feed);	// saving customer object
			txn.commit(); 					// ending transaction with commit
		} catch (Exception e) {
			txn.rollback();					//transaction failed hence rollback
			e.printStackTrace();
		}

		
	}
	
	@Test
	public void testSaveComment() {
		
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		try {
			Comment comment = new Comment();
			
			comment.setCommentId(10001);
			comment.setFeedId(1001);
			comment.setUserId("prapti");
			comment.setComment("Go to Python Docs, they have an awesome tutorial!");
			comment.setCommentTimestamp(new Date());
			
			session.save(comment);	// saving customer object
			txn.commit(); 					// ending transaction with commit
		} catch (Exception e) {
			txn.rollback();					//transaction failed hence rollback
			e.printStackTrace();
		}

		
	}
	
	@Test
	public void testGetUser() {
		
		Session session = HibernateUtil.getSession();
		//Transaction txn = session.beginTransaction();
		
		User user= (User) session.get(User.class, "prapti");
		System.out.println("Name :"+user.getEmail());

	}
	
	@Test
	public void testGetFeed() {
		
		Session session = HibernateUtil.getSession();
		//Transaction txn = session.beginTransaction();
		
		Feed feed= (Feed) session.get(Feed.class, 1001);
		System.out.println("Question :"+feed.getQuestion());

		
	}
	
	@Test
	public void testGetComment() {
		
		Session session = HibernateUtil.getSession();
		//Transaction txn = session.beginTransaction();
		
		Comment comment= (Comment) session.get(Comment.class, 10001);
		System.out.println("Comment :"+comment.getComment());
		
	}

}
