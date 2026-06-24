package in.kodewala.stream5.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintFirstElementOfList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
		
		Optional<Integer> firstElement = numbers.stream()
			   .findFirst();
		
		System.out.println(firstElement.get());
	}
}
