package in.kodewala.abstract1;

abstract class Welcome { // (Abstract) + (Non-Abstract(Concrete) - Mehtod with body)

	public abstract void welcome(); // what?

	// Non-Abstract(Concrete) - Mehtod with body
	public void greet() {
		System.out.println("Welcome.greet()");
	}

	public Welcome() {
		super();
		System.out.println("Welcome.Welcome()........Constructor");
	}
}

class Institute extends Welcome {

	@Override
	public void welcome() { // How?
		System.out.println("Welcome.welcome().....Welcome to Kodewala");
	}

}

public class Main {

	public static void main(String[] args) {

		// Welcome welcome = new Welcome(); // can't create object of abstract class

		Institute ins = new Institute();
		ins.welcome();
		ins.greet();
	}
}
