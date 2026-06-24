package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxValueInList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 4, 6, 8, 15, 2, 19);
		
		Optional<Integer> max = numbers.stream()
		       .max(Integer :: compareTo);
		
		System.out.println(max);

	}
}
