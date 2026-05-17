package in.nadeem.FI.lambdaexpre;

public class LambdaRunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> System.out.println("New thread created...."));
		thread.start();
	}
}
