package in.collection.linkedList_2;

import java.util.LinkedList;

//5. Iterate Using For-Each

public class Driver5 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		for (String tgs : technologies) {
			System.out.println(tgs);
		}
		
		System.out.println("--------------------------------");

		technologies.forEach(System.out::println);
		
		System.out.println(technologies.size());
	}
}
