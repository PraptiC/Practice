package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hey")
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
	@Value("Annotated Shilpa")
	public void setName(String name) {
		this.name = name;
	}

}
