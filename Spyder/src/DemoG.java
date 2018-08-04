
public class DemoG<G> {
	private G data;

	public DemoG() {

	}

	public DemoG(G data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(G data) {
		this.data = data;
	}

	public static void main(String[] args) {
		DemoG<String> d1 = new DemoG<String>("Hello");
		System.out.println(d1.getData());

		DemoG<Integer> d2 = new DemoG<Integer>(5000);

		System.out.println(d2.getData());
		//d2.setData("Syr");
	}

}
