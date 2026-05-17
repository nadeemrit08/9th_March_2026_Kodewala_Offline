package com.kodewala.equalsexp;

public class ConcatDemo {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // 1 object created in scp

		String s3 = s1.concat(" Academy"); // s3 -- > heap and content : Kodewala Academy
		String s4 = "Kodewala Academy"; // s4 -- > scp and content : Kodewala Academy
		System.out.println(s3 == s4);

		String s10 = "Banglore";
		String s11 = " India";
		String s12 = s10 + s11; // s12 will be created in Heap -- > Bangalore India
		System.out.println(s12);
		String s13 = "Banglore India"; // SCP

		System.out.println(s12 == s13);
		System.out.println(s12.equals(s13));

		String s14 = "Hello" + " World" + " India"; // Compile time optimization
													// only single object will be created
		System.out.println(s14);
	}
}
