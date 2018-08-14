package ex2;

public class TwitterMessageService implements MessageService {
	public TwitterMessageService() {
		System.out.println("Twitter Message Service Const");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("Tweet sent to "+to+" with "+msg);
		
	}

}
