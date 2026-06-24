package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 2. Filter Even Numbers from a List
		 */
		List<Integer> listOfEvenNumbers = numbers.stream()
		       .filter(number -> number%2==0)
		       .collect(Collectors.toList());
		
		System.out.println(listOfEvenNumbers);
	}
}
