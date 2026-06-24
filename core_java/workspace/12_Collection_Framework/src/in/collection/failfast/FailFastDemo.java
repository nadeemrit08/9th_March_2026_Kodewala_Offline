package in.collection.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {

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
		Iterator<String> itr = products.iterator();

		while (itr.hasNext()) {
			
			String element = (String) itr.next();
			
			if (element.startsWith("#")) {
				
				itr.remove();
				
				System.out.println("Removing junk element");
			}
			System.out.println(products);
		}
	}
}
