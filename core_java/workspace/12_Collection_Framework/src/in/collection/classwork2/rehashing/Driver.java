package in.collection.classwork2.rehashing;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("N1");
		set.add("N2");
		set.add("N3");
		set.add("N4");
		set.add("N5");
		set.add("N6");
		set.add("N7");
		set.add("N8");
		set.add("N9");
		set.add("N10");
		set.add("N11");
		set.add("N12");

		System.out.println(set);
		
		set.add("N13");
		
		System.out.println(set);
	}
}
