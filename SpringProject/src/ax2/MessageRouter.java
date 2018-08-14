package ax2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component("router")
public class MessageRouter{
	@Autowired
	private ApplicationContext appctx;

	public void processMessage(String type, String to, String msg) {
		MessageService service = (MessageService)appctx.getBean(type);
		service.send(to, msg);
	}

}
