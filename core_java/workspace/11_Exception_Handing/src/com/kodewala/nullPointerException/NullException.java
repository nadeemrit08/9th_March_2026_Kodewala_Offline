package com.kodewala.nullPointerException;

public class NullException {

	public void doSomething() {
		
		String name = null;

		try {

			System.out.println(name.length());
			System.out.println("After legth....");

		} catch (Exception e) {
			name = "NA";
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("NullException.doSomething()");
		}
	}
	
	public static void main(String[] args) {
		
		NullException exception = new NullException();
		exception.doSomething();
	}
}
