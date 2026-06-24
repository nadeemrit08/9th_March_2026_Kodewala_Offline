package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;

public class PrintEvenDivisibleBy10 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 5, 1, 2, 4, 6, 7, 8, 9);
		
		numbers.stream()
			   .filter(n -> n%2==0)
			   .map(n -> n*10)
			   .forEach(n -> System.out.println(n));
	}
}
