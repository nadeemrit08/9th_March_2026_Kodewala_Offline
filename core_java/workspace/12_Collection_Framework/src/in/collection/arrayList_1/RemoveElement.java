package in.collection.arrayList_1;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();

		cities.add("BLR");
		cities.add("CHE");
		cities.add("HYD");
		cities.add("AHM");
		cities.add("DEl");

		// access or random read -->get the 3rd element
		System.out.println(cities.get(3)); // AHM -->O(1)

		cities.remove(1);
		System.out.println(cities);
	}
}
