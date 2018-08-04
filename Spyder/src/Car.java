
public class Car {
	private String model;
	private String[] features;

	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String feature : features) {
			System.out.println(feature);

		}
		System.out.println("\n\n");
	}

	public static void main(String[] args) {
		//String[] altof = {};
		Car alto = new Car("Alto",  "Power Steering", "Power window", "Keyless entry" );
		alto.specs();
		//String[] jazzf = {  };
		Car jazz = new Car("Jazz", "Keyless start", "ABS", "Pano Roof", "Auto Gears", "Cruise");
		jazz.specs();
	}

}
