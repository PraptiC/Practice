import java.io.Serializable;

public class Student implements  Serializable {
	private int math, sci, eng;// total;
	private transient int  total;

	public Student() {
	}

	public Student(int math, int sci, int eng) {
		this.math = math;
		this.sci = sci;
		this.eng = eng;
		total = math + sci + eng;
	}

	public void result() {
		System.out.println("Maths: " + math);
		System.out.println("Science:" + sci);
		System.out.println("English: " + eng);
		System.out.println("Total:" + total);
	}

}
