package in.kodewala.stream7.highestNo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Third_Highest_Number {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		 Optional<Integer> thirdHighestEvenNumber = numbers.stream()
				.filter( number-> number%2==0)
		       .distinct()
		       .sorted((b , a) -> b-a)
		       .skip(2)
		       .findFirst();
		 
		 System.out.println(thirdHighestEvenNumber.get());
	}
}
