package in.collection.linkedList_3;

/*
 * 19. Remove Null Values
 */
import java.util.LinkedList;

public class Driver7 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("JDBC");
		technologies.add("H2");
		technologies.add("HTML");
		technologies.add(null);

		technologies.removeIf(technology -> technology == null);
		System.out.println(technologies);

	}
}
