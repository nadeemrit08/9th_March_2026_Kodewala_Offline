package in.kodewala.stream10.partitioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Divide_Str_Of_List {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");

		Map<Boolean, List<String>> listOfStr = list.stream()
													/*
													 * it will partition data based on the requirement
													 */
		                                           .collect(Collectors.partitioningBy(str -> str.length() < 6));
		
		System.out.println(listOfStr);
	}
}
