package com.kodewala;

public class ExceptionHanding {

	public static void main(String[] args) {

		System.out.println("ExceptionHanding.main()..............Start");

		String name = null;

		try {
			System.out.println(" Before occurs NullPointerException the Exception");

			System.out.println(" length " + name.length());// Risky -- > may throw an Exception

			System.out.println(" After occurs NullPointerException the Exception");// skipped in case of NPE

		} catch (NullPointerException e) {

			e.printStackTrace();
			System.out.println("Name is null .... "); // Message
		}

		try {
			int amount = 200 / 0;
			System.out.println("Before occurs Arithematic Exception");

			System.out.println("Amount : " + amount);

			System.out.println("After occurs Arithematic Exception");

		} catch (ArithmeticException e1) {

			e1.printStackTrace();
			System.out.println("Handled Arithmatic Exception"); // Message
		}
		System.out.println("ExceptionHanding.main()..................End");

	}

}
