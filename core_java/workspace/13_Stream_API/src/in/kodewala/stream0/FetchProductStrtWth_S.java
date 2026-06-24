package in.kodewala.stream0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FetchProductStrtWth_S {

	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();

		// Storing the products
		products.add("Apple");
		products.add("LG");
		products.add("Samsung");
		products.add("Sony");

		/*
		 * Find products which are starting with 'S'
		 */
		
		// Approach-1 : Using Iterator
		
		Iterator<String> itr = products.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.startsWith("S")) {
				System.out.println("products start with S :: " + element);
			}
		}
		
		System.out.println();

		// Approach-1 : Using Enhanced Loop(for each Loop)
		
		for(String product : products) {
			if(product.startsWith("S")) {
				System.out.println("products start with S :: " + product);
			}
		}
	}
}
