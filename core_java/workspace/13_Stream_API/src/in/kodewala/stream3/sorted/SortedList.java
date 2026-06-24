package in.kodewala.stream3.sorted;

import java.util.Arrays;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(9, 4, 7, 2, 1, 6, 8);
		
		numbers.stream()
		       .sorted((firstNum , secondNum) -> secondNum-firstNum)
		       .forEach(num -> System.out.print(num + " "));
	}
}
