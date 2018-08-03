
public class MyThread extends Thread {
	private int data;

	public MyThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		for (int c = 1; c <= 50; c++)
			System.out.println(++data+"\tfrom\t"+currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");
		MyThread mt3 = new MyThread("Third");

		mt1.start();
		mt2.start();
		mt3.start();
		
		for (int c = 1; c <= 50; c++)
			System.out.println(c+"\tfrom\t"+currentThread().getName());

	}
}
