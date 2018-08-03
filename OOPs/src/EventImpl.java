
public class EventImpl implements Event {

	public void doSomething() {
		System.out.println("First event implementation");
	}

	// inner Class
	public static class InnerEventImpl implements Event {

		public void doSomething() {
			System.out.println("Second event implementation");
		}

	}

	public void doingSomething() {
		class InnerMostImpl implements Event {

			public void doSomething() {
				System.out.println("Third event implementation");
			}

		}
		;
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {	//anonymous inner class
		new Event() {

			@Override
			public void doSomething() {
				System.out.println("Fourth event implemntation");
			}

		}.doSomething();
	}
	public void doingSomethingOneLastTime() {	//lambda expressions
		Event e = () -> System.out.println("Fifth event Implemntation");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();

		// InnerEventImpl innerImpl = impl.new InnerEventImpl(); //when inner class is
		// not static
		InnerEventImpl innerImpl = new EventImpl.InnerEventImpl();
		innerImpl.doSomething();

		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();
	}
}
