package in.collection.linkedList_2;

import java.util.LinkedList;

/*
 * 7. Replace Element
 * 
 */
public class Driver7 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		technologies.set(1, "Spring Boot");

		System.out.println(technologies);
	}
}
