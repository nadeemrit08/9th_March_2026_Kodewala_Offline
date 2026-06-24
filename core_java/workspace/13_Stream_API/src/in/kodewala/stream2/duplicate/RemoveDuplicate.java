package in.kodewala.stream2.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 5, 2, 3, 7, 8, 9);

		/*
		 * Remove duplicate Element from a given list
		 */
		List<Integer> uniqueNumbers = numbers.stream()
				                             .distinct()
				                             .collect(Collectors.toList());

		System.out.println(uniqueNumbers);
	}
}
