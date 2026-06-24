package in.collection.failfast;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo2 {

	public static void main(String[] args) {

		List<String> products = new CopyOnWriteArrayList<String>();

		products.add("Apple");
		products.add("Samsung");
		products.add("LG");
		products.add("something");

		/*
		 * for (String product : products) { // Loop through products.add("test"); }
		 */

		Iterator<String> itr = products.iterator();

		while (itr.hasNext()) {

			String element = (String) itr.next();

			products.remove("Samsung");
			System.out.println("Removing junk element");

			System.out.println(products);
		}
	}
}
