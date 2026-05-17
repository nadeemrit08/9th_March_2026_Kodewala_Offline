package com.kodewala1;

public class Order {

	void doSomething() {
		String name = null;

		try {
			System.out.println(name.length()); // assume : recieved from other class
			System.out.println("After length");
			int i = 0;
			String a[] = {};
			String str = a[5];
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} /*
			 * catch (Exception e) { // nullPointerException is child of exception class
			 * name = "NA"; e.printStackTrace(); }
			 */

		for (int i = 0; i < 5; i++) {
			System.out.println("Driver.main(): " + i);
		}
	}
}
