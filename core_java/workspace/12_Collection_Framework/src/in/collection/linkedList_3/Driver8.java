package in.collection.linkedList_3;

import java.util.Collections;
/*
 *20. Find Frequency of an Element
 */
import java.util.LinkedList;

public class Driver8 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("JDBC");
		technologies.add("H2");
		technologies.add("HTML");
		technologies.add(null);

		int frequency = Collections.frequency(technologies, "Java");
		System.out.println(frequency);

	}
}
