package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyStr {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("", "apple", "banana", "cherry");

		/* 3. Find the First Non-Empty String 
		 * 
		 */
		Optional<String> nonEmptyStr = fruits.stream()
		      .filter(fruit -> !fruit.isEmpty())
		      .findFirst();
		
		System.out.println(nonEmptyStr);
	}
}
