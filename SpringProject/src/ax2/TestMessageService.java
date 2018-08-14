package ax2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
 @Test
 public void testCase() {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("annotated.xml");	
	 //Container within JUnit; 
	 //so that all three types of messages can be processed
	 MessageRouter router = (MessageRouter) ctx.getBean("router");
	 router.processMessage("sms", "9601shilpa", "Nice to meet u");
	 router.processMessage("email","6543praptiC","Happy Bday Prapti");
	 router.processMessage("tweet", "shilparajput@gmail", "Hola Shilpa");
 }
}
