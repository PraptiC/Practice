package ex4;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {
	@Test
	public void lafda() {
		ConfigurableApplicationContext aivai = new ClassPathXmlApplicationContext("ex4/appctx.xml");
		MyLife dukh = aivai.getBean(MyLife.class);
		aivai.close();
	}
}
