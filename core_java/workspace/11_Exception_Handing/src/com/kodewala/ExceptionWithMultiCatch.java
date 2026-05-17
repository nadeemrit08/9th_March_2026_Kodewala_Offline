package com.kodewala;

public class ExceptionWithMultiCatch {

	public static void main(String[] args) {

		try {
			System.out.println("ExceptionWithMultiCatch.main() :: try");

			int x = 10 / 0;

		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException
				| ArithmeticException e) { // introduce in java-7
			e.printStackTrace();
			System.out.println("ExceptionWithMultiCatch.main() :: catch");
		}
	}
}
