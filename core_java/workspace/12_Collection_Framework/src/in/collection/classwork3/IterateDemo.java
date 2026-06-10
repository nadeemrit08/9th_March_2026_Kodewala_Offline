package in.collection.classwork3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateDemo {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("Nadeem");
		names.add("John");
		names.add("Sumit");
		names.add("Suresh");
		names.add("Raju");

		// Task : Get the cities name which start with 'A'
		// How do you read / iterate the collection / set

		// Approach-1 : Using Enhanced for loop
		for (String name : names) {
			if (name.startsWith("S")) {
				System.out.println(name);
			}
		}

		/*
		 * Approach-2 : Using Iterator
		 */
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) { // check if next element is there or not ?
			String name = itr.next(); // read the element
			if (name.startsWith("S")) { // performing logic
				System.out.println("Names start with S : " + name);
			}
		}
	}
}
