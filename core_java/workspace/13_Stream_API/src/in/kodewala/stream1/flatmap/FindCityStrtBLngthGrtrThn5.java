package in.kodewala.stream1.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCityStrtBLngthGrtrThn5 {

	public static void main(String[] args) {
		
		/*
		 * Find the city names which starts with 'B' and city name length start more than 6
		 */

		List<List<String>> input = Arrays.asList(Arrays.asList("Bangalore", "Chennai", "Barailey"),
				                   Arrays.asList("Hyderabad", "Ahmedabad", "Delhi"), 
				                   Arrays.asList("Banaras"));

		System.out.println("2-D :: " + input);

		List<String> flattenListOfCity = input.stream()
				                              .flatMap(list -> list.stream())
				                              .collect(Collectors.toList());

		System.out.println("1-D :: " + flattenListOfCity);

		flattenListOfCity.stream()
		                 .filter(city -> city.startsWith("B") && city.length() > 5)
				         .forEach(System.out::println);
	}
}
