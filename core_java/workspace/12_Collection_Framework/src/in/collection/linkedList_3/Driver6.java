package in.collection.linkedList_3;

/*
 * 18. Count Elements Greater Than Length 5
 */
import java.util.LinkedList;

public class Driver6 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");
		technologies.add("JDBC");
		technologies.add("H2");
		technologies.add("HTML");

		for(String name : technologies) {
			if (name.length() > 5) {
				System.out.println(name);
			}
		}

		
		
	}
}
