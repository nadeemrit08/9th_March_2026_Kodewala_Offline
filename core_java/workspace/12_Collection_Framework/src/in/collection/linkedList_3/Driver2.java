package in.collection.linkedList_3;

import java.util.LinkedHashSet;
/*
 * 12. Remove Duplicate Element
 */
import java.util.LinkedList;

public class Driver2 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("Hibernate");

		LinkedHashSet<String> set = new LinkedHashSet<String>(technologies);
		System.out.println(set);
	}
}
