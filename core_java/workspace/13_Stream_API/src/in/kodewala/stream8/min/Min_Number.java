package in.kodewala.stream8.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min_Number {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> min = numbers.stream()
				                       .min((a , b) -> a - b);
		
		
		System.out.println("Min Number :: " + min.get());
		
		Optional<Integer> max = numbers.stream()
                                       .max((a , b) -> a - b);


         System.out.println("Max Number :: " + max.get());
	}
}
