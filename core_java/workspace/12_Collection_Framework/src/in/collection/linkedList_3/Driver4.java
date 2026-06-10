package in.collection.linkedList_3;

/*
 * 12. Remove Duplicate Element
 */
import java.util.LinkedList;

public class Driver4 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		String longest = "";

		for (String value : technologies) {
			if (value.length() > longest.length()) {
				longest = value;
			}
		}
		System.out.println(longest);
	}
}
