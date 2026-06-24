package in.collection.failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

	public static void main(String[] args) {

		List<String> products = new CopyOnWriteArrayList<String>();

		products.add("Apple");
		products.add("Samsung");
		products.add("LG");
		products.add("something");

		Iterator<String> itr = products.iterator(); //Fail Safe

		while (itr.hasNext()) {

			String element = (String) itr.next();

			products.remove("Samsung");
			System.out.println("Removing junk element");

		}
		System.out.println(products);
	}
}
