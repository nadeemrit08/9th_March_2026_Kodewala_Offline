package in.kodewala.stream12.mergeList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList_Find_Unique_Str {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays. asList("Bangalore", "Delhi", "Pune", "Chennai", "Hyderabad");
		List<String> list2 = Arrays. asList("Delhi", "Noida", "Mysore", "Delhi");
		
		List<String> listOfUniqueElement = Stream.concat(list1.stream(), list2.stream())
		                                         .distinct()
		                                         .collect(Collectors.toList());
		
		System.out.println("List of unique strings :: " + listOfUniqueElement);
	}
}
