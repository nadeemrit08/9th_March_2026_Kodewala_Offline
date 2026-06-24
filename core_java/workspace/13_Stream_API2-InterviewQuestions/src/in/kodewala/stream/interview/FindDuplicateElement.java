package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,3,6);
		
		Set<Integer> set = new HashSet<Integer>();
		
		numbers.stream()
		       .filter(n -> !set.add(n))
		       .forEach(System.out::println);
	}
}
