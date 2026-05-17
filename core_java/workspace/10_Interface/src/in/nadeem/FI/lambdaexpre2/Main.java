package in.nadeem.FI.lambdaexpre2;

/*main()
│
├── load functional interface
│
├── create lambda implementation (runtime)
│
├── assign to msg
│
├── call msg.show()
│
└── execute lambda body → print output*/

@FunctionalInterface
interface Message {
	void show();
}

public class Main {

	public static void main(String[] args) {

		Message msg = () -> System.out.println("Hello Lambda");
		
		msg.show();
	}
}
