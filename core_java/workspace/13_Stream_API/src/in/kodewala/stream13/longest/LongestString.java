package in.kodewala.stream13.longest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays. asList("Bangalore", "Delhi", "Pune", "Chennai", "Hyderabad");
		List<String> list2 = Arrays. asList("Delhi", "Noida", "Mysore", "Delhi");
		
		Optional<String> longestString = Stream.concat(list1.stream(), list2.stream())
		      .max(Comparator.comparing(String::length));
		
		System.out.println(longestString.get());
		      
	}
}
