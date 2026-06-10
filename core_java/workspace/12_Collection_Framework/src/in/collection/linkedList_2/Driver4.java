package in.collection.linkedList_2;

import java.util.LinkedList;

//4. Remove First and Last Element

public class Driver4 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		System.out.println(technologies.removeFirst());
		System.out.println(technologies.removeLast());
		
		System.out.println(technologies);
	}
}
