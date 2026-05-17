package com.kodewala.equalsexp;

class  InternChild {

}

public class InternExp extends InternChild {

	public static void main(String[] args) {

		String s1 = "Nadeem" + " Ahmad"; // compile time optimization

		System.out.println(s1); // --- Nadeem Ahmad

		String s2 = "Nadeem"; // SCP

		String s3 = " Ahmad"; // SCP

		String s4 = s2 + s3; // Heap

		String s5 = s4.intern(); // it will copy object from heap to SCP

		System.out.println(s5);

		System.out.println(s4 == s5); // true(SCP)

	}
}
