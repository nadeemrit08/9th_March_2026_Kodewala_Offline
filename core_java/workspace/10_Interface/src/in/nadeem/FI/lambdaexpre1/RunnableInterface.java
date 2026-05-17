package in.nadeem.FI.lambdaexpre1;
/*main() thread
│
├── creates Runnable (anonymous class)
│
├── creates Thread (NEW)
│
├── calls start()
│
└── JVM creates new thread
        │
        └── calls run()
                │
                └── prints output*/

public class RunnableInterface {

	
	public static void main(String[] args) {

		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("RunnableInterface.main(...).new Runnable() {...}.run() : Thread is Running");
			}
		};

		Thread thread = new Thread(task);
		thread.start();
	}
}
