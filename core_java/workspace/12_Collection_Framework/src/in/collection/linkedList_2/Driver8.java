package in.collection.linkedList_2;

import java.util.LinkedList;

/*
 * clear entire list
 * 
 */
public class Driver8 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		technologies.clear();

		System.out.println(technologies);
	}
}
