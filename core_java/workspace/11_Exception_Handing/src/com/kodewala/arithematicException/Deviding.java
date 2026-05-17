package com.kodewala.arithematicException;

public class Deviding {

	public static void main(String[] args) {

		System.out.println("Deviding.main()....Started");

		try {
			int devide = 100 / 0;
			System.out.println(devide);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Can not devided by zero");
		}
		System.out.println("Deviding.main().....Ended");
	}
}
