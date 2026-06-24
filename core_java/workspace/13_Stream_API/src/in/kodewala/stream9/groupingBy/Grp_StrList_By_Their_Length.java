package in.kodewala.stream9.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grp_StrList_By_Their_Length {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");

		Map<Integer, List<String>> listOfString = list.stream()
		                                              .collect(Collectors.groupingBy(str -> str.length()));
		
		System.out.println("List of String based on their length :: " + listOfString);
		
		Map<Integer, List<String>> listOfStr = list.stream()
				                                   .filter(str -> str.length() > 6)
                                                   .collect(Collectors.groupingBy(str -> str.length()));
		
		System.out.println("List of String based on their length > 6 :: " + listOfStr); // counting
	}
}
