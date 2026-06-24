package in.nadeem.thread1;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("Thread is running..... " + Thread.currentThread().getName() );
		
	}

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.setName("NadeemThread");
		myThread.start();
		System.out.println(myThread.getState());

	}
}


