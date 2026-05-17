package in.nadeem.obj;

public class Payment {

	{
		System.out.println("inside IIB");
	}

	static {
		System.out.println("inside SIB.... only once....");
	}

	public Payment() {
		// 1-line --> super() or this()
		// 2nd call to initialize(intit) block
		System.out.println(" Inside payment() constructor");
	}

	public static void main(String[] args) {
		Payment py = new Payment();
	}
}
