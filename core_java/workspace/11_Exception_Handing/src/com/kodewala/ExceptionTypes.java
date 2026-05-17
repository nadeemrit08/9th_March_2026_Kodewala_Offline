package com.kodewala;

public class ExceptionTypes {

	

	public static void main(String[] args) { // +ve -- > Happy Scenario

		System.out.println("ExceptionTypes.main().............START");

		String balance = args[0];
		int getBalance = Integer.parseInt(balance);// "100a50" -- > NumberFormatException

		String empName = args[1]; // ArrayIndexOutOfBoundsException

		int result = getBalance / 0; // by zero --> ArithmeticException

		System.out.println(" Balance " + getBalance);
		System.out.println(" length " + empName.length());// NullPointerException -- > exited

		System.out.println("ExceptionTypes.main().............START");
	}
}
