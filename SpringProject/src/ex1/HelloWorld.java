package ex1;

public class HelloWorld {
	private String name;

	public HelloWorld() {
		System.out.println("Default contructor");
	}

	public HelloWorld(String name) {
		System.out.println("Parameterized contructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
