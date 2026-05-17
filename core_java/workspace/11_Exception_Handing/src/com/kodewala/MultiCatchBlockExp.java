package com.kodewala;

public class MultiCatchBlockExp {

	public static void main(String[] args) {

		try {

			int[] arr = { 1, 2 };

			System.out.println(arr[5]);

			int a = 10 / 0;
			System.out.println(a);

		} catch (ArithmeticException e) {
			System.out.println("Math Issue");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Issue");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("General issue");
			e.printStackTrace();
		}
	}
}
