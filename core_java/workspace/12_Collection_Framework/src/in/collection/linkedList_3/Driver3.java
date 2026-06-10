package in.collection.linkedList_3;
/*
 * Merge Two List
 */
import java.util.LinkedHashSet;
/*
 * 12. Remove Duplicate Element
 */
import java.util.LinkedList;

public class Driver3 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("Hibernate");
		
		LinkedList<String> technologies1 = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("Hibernate");

		technologies.addAll(technologies1);
		
		System.out.println(technologies);
	}
}
