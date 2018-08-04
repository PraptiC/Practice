
public class DemoGenerics {
	private Object data;

	public DemoGenerics() {

	}

	public DemoGenerics(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static void main(String[] args) {
		DemoGenerics d1= new DemoGenerics("Hello");
		System.out.println(d1.getData());
		
		DemoGenerics d2 = new DemoGenerics(5000);
		
		System.out.println(d2.getData());
	}

}
