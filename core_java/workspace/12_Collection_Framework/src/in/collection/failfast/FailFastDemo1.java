package in.collection.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo1 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();

		products.add("Apple");
		products.add("#Samsung");
		products.add("LG");
		products.add("something");

		for (String product : products) { // Loop through products.add("test"); }
			
			if (product.startsWith("#")) {
				
				products.remove(product);
				
				System.out.println("Removing junk element");
			}
		}

	}
}
