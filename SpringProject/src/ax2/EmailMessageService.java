
package ax2;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailMessageService implements MessageService {
public EmailMessageService() {
	System.out.println("EmailMessageSErvice Const");}
	@Override
	public void send(String to, String msg) {
		System.out.println("Email sent to " + to + " with " + msg);
	}

}
