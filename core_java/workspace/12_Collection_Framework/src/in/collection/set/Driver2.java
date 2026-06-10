package in.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Driver2 {

	public static void main(String[] args) {

		Set<String> persons = new HashSet<String>();

		persons.add("Nadeem");
		persons.add("Ahmad");
		persons.add("Raju");
		persons.add("Rani");
		persons.add("Suresh");
		persons.add("Suresh");

		System.out.println("Nadeem".hashCode());

		int hash = "Nadeem".hashCode();
		hash = hash ^ (hash >>> 16); // Hash spreading
		int bucketIndex = (16 - 1) & hash;
		System.out.println(" Nadeem stored at " + bucketIndex);

		System.out.println(persons);
	}
}
