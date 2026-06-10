package in.collection.linkedList_3;

/*
 * 17. Print Elements Starting with 'S'
 */
import java.util.LinkedList;

public class Driver5 {

	public static void main(String[] args) {

		LinkedList<String> technologies = new LinkedList<String>();

		technologies.add("Java");
		technologies.add("Spring");
		technologies.add("Hibernate");

		

		for (String value : technologies) {
			if(value.startsWith("H")) {
				System.out.println(value);
			}
		}
		
	}
}
