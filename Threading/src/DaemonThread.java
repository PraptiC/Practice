
public class DaemonThread extends Thread {
	private int limit;

	public DaemonThread(String name, int limit) {
		super(name);
		this.limit=limit;
	}

	@Override
	public void run() {
		String name=currentThread().getName();
		for(int c=1;c<=limit;c++)
			System.out.println(name+" : "+c);
	}
	public static void main(String[] args) {
		DaemonThread d1= new DaemonThread("alpha", 50);
		DaemonThread d2= new DaemonThread("bravo", 25);
		DaemonThread d3= new DaemonThread("Charlie", 75);
		DaemonThread d4= new DaemonThread("Daemon", 500000);
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();	
		d4.start();
	}
	
}
