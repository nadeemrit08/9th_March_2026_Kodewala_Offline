package in.kodewala.stream7.sum;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_List {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		Integer sum = numbers.stream()
		       .reduce(0, (a,b) -> a +b);
		System.out.println(sum);
		    		   
		
	}
}
