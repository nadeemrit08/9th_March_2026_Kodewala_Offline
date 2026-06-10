package in.collection;

import java.util.LinkedList;

public class Driver_3 {

	public static void main(String[] args) {

		LinkedList<String> electronics = new LinkedList<String>();

		electronics.add("Laptop");
		electronics.add("Smartphone");
		electronics.add("Tablet");
		electronics.add("Smartwatch");

		System.out.println("Electronics Products :: " + electronics);

		electronics.add("TV");
		electronics.add("Camera");

		electronics.remove("Tablet");

		System.out.println("Updated Products :: " + electronics);
	}
}
