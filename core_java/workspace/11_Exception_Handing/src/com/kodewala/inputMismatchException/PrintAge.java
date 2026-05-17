package com.kodewala.inputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("PrintAge.main()....Started");

		try {

			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Age: " + age);

		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Enter Number Only...!!!");
		}
		System.out.println("PrintAge.main()......Ended - ThankYou...!!");
	}
}
