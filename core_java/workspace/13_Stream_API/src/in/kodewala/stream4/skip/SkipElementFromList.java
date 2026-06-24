package in.kodewala.stream4.skip;

import java.util.Arrays;
import java.util.List;

public class SkipElementFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.stream()
		       .skip(3)
		       .forEach(number -> System.out.print(number + " "));

	}
}
