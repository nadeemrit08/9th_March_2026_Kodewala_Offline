package in.collection.linkedList_3;

import java.util.Iterator;
/*
 * 11. Reverse Traversal Using Descending Iterator
 */
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		
		Iterator<String> itr = technologies.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
