package ex2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageRouter implements ApplicationContextAware {
	private ApplicationContext appctx;

	@Override
	public void setApplicationContext(ApplicationContext appctx) throws BeansException {
		this.appctx = appctx;
	}

	public void processMessage(String type, String to, String msg) {
		MessageService service = (MessageService)appctx.getBean(type);
		service.send(to, msg);
	}

}
