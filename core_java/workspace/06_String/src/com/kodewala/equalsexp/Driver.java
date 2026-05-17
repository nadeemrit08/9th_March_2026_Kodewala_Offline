package com.kodewala.equalsexp;

public class Driver {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // 1 object in SCP

		String s3 = "Kodewala";

		System.out.println(s1 == s3);

		// String original = "Academy"; // 1 in SCP

		String s2 = new String("Academy"); // 1 in heap
		
		System.out.println(s2 == s3);
	}
}
