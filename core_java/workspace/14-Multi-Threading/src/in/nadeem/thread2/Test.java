package in.nadeem.thread2;

class MyThread extends Thread {

	public void run() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
		}
		System.out.println("Task Completed");
	}
}

public class Test {

	public static void main(String[] args) throws Exception {

		MyThread t = new MyThread();

		System.out.println(t.getState());
		// NEW

		t.start();

		System.out.println(t.getState());
		// RUNNABLE

		Thread.sleep(100);

		System.out.println(t.getState());
		// TIMED_WAITING

		t.join();

		System.out.println(t.getState());
		// TERMINATED
	}
}
