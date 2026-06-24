package in.kodewala.stream6.highestSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindHighestSalary {

	public static void main(String[] args) {
		
		List<Integer> salary = Arrays.asList(900,1200,300,12500,15000);
		
		/*
		 * Task : Find the 2nd highest salary from a given List
		 * 
		 * Step-1 : remove duplicate
		 * Step-2 : sorted the list in descending order
		 * Step-3 : skip the first element
		 * Step-4 : find first element
		 */
		Optional<Integer> secondHighestSalary = salary.stream()
			  .distinct()
			  .sorted((lowest, highest) -> highest-lowest)
			  .skip(1)
			  .findFirst();
		
		System.out.println("Second Highest Salary :: " + secondHighestSalary.get());
			 
	}
}
