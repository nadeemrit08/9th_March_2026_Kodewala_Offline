package in.collection;

import java.util.ArrayList;

public class Driver_2 {

	public static void main(String[] args) {

		ArrayList<String> products = new ArrayList<String>();

		products.add("Laptop");
		products.add("Smartphone");
		products.add("Headphone");

		System.out.println("Electronic Products :: " + products);

		System.out.println("First Product :: " + products.get(0));

		products.remove("Smartphone");
		System.out.println("After Removing Smartphone Electronic Products :: " + products);

		System.out.println("Total Products :: " + products.size());

	}
}
