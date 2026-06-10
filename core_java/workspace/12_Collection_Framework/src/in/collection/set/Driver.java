package in.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>();

		cities.add("Bangalore");
		cities.add("Jaipur");
		cities.add("Mysore");
		cities.add("Hyderabad");
		cities.add("Chennai");// 4th index
		cities.add("chennai"); // 4th index

		System.out.println("Bangalore".hashCode());
		System.out.println("Bangalore".hashCode());
		// System.out.println("chennai".hashCode());
		// -1887669656 & 15 -- > 4th

		int hash = "Mysore".hashCode();
		hash = hash ^ (hash >>> 16); // Hash spreading
		int bucketIndex = (16 - 1) & hash;
		System.out.println(" Bangalore stored at " + bucketIndex);

		System.out.println(cities);
	}
}
