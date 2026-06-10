package in.collection.linkedList_2;

import java.util.LinkedList;

//3. Get First and Last Element

public class Driver3 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		System.out.println("First Element :: " + technologies.getFirst());
		System.out.println("Last Element :: " + technologies.getLast());
	}
}
