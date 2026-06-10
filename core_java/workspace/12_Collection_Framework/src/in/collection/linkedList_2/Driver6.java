package in.collection.linkedList_2;

import java.util.LinkedList;

/*
 * 7. Check Element Exists
 * 
 */
public class Driver6 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		if (technologies.contains("Java")) {
			System.out.println("Available");
		}
	}
}
