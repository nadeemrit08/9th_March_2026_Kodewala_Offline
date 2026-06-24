package in.kodewala.stream0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateNestedList {

	public static void main(String[] args) {

		List<List<String>> cities = Arrays.asList(Arrays.asList("Delhi", "Mumbai", "Bengaluru"),
						                          Arrays.asList("Pune", "Delhi", "Chennai"), 
						                          Arrays.asList("Mumbai", "Hyderabad", "Bhopal"));

		HashSet<String> set = new HashSet<String>();

		/*
		 * set.add() return value in boolean it will check
		 * if city is exists it will return false otherwise
		 * it will add and return true      
		 */
		
		cities.stream()
		      .flatMap(List::stream)
		      .filter(city -> !set.add(city))
		      .forEach(city -> System.out.println("Duplicate City :: " + city));
	}
}
