package in.collection.classwork4.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> cities = new LinkedHashSet<String>();

		cities.add("BLR");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("AHM");
		cities.add("HYD");
		cities.add("AMR");

		System.out.println(cities);

		for (String city : cities) {
			if (city.startsWith("A")) {
				System.out.println(city);
			}
		}
	}
}
