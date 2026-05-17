package com.kodewala.arrayIndexOfBoundsException;

public class ArrayIndexOffBoundsException {

	public static void main(String[] args) {

		System.out.println("ArrayIndexOffBoundsException.main()....STARTED");

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		try {

			System.out.println(arr[10]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Invalid index! Array size is only : " + arr.length);
		}

		System.out.println("This line would be executed....!!!!");

	}
}
