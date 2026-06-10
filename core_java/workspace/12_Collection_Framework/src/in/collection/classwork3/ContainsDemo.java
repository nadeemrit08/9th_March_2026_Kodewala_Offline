package in.collection.classwork3;

import java.util.HashSet;
import java.util.Iterator;

public class ContainsDemo {

	public static void main(String[] args) {

		HashSet<String> cities = new HashSet<String>();

		cities.add("BLR");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("AHM");
		cities.add("HYD");
		cities.add("AMR");

		// Task : Get the city name(s) which start with 'A'
		// how do you read / iterate the collection / set

		// Approach-1 : Using Enhanced Loop
		for (String city : cities) {
			if (city.startsWith("A")) { // processing logic
				System.out.println("Cities which are staring with 'A' is : " + city);
			}
		}
		
		System.out.println();

		// Approach-2 : Using Iterator

		Iterator<String> itr = cities.iterator();
		while (itr.hasNext()) {
			String city = itr.next();
			if (city.startsWith("A")) {
				System.out.println("Cities which are staring with 'A' is : " + city);
			}
		}
	}
}
