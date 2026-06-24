package in.nadeem.thread3.join;

class MyThread extends Thread {

	@Override
	public void run() {
		super.run();

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();

		t.start();

		t.join();

		System.out.println("JoinMethod.main() :: main execute after child thread completion");
	}
}
