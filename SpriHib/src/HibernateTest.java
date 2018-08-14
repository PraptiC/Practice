import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.Product;
import repo.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)					//JUnit within container; Spring feature
@ContextConfiguration(locations="classpath:appctx.xml") 
public class HibernateTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testHibernate() {
		Product p = new Product();
		p.setName("HackBook");
		p.setPrice(200.0);
		productRepository.add(p);
				
	}
	
}
