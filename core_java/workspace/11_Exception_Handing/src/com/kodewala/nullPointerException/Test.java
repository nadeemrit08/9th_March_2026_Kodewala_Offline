package com.kodewala.nullPointerException;

public class Test {

	public static void main(String[] args) {

		System.out.println("Test.main()...Started");

		String str = null;

		try {
			System.out.println(str.length());

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("String contains null...!!!");
		}
		System.out.println("Test.main().....Ended : thankyou");
	}
}
