package in.collection.linkedList_2;

import java.util.LinkedList;

/*
 * 10. Check Empty List
 * 
 */
public class Driver10 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		if (technologies.isEmpty()) {
			System.out.println("List is Empty");
		}else {
			System.out.println("List is nott emplty");
		}
	}
}
