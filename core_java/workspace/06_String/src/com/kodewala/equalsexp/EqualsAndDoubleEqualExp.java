package com.kodewala.equalsexp;

public class EqualsAndDoubleEqualExp {

	public static void main(String[] args) {

		String s1 = "Banglore"; // obj created in SCP(String Constant Pool)
		String s2 = new String("Banglore"); // Obj created in Heap + SCP

		System.out.println(s1.equals(s2)); // compare object value
		System.out.println(s1 == s2); // compare object address
	}
}
