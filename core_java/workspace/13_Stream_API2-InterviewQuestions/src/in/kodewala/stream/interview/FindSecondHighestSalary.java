package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestSalary {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
		        new Employee(1,"Ali","IT",50000),
		        new Employee(2,"Ahmad","HR",70000),
		        new Employee(3,"Nadeem","IT",90000),
		        new Employee(4,"Rahul","Finance",60000),
		        new Employee(5,"Aman","IT",90000)
		);
		
		/*
		 * 1. Find Second Highest Salary
		 */		
		Double secondHighest = employees.stream()
				 .map(Employee :: getSalary)
				 .distinct()
				 .sorted(Comparator.reverseOrder())
				 .skip(1)
				 .findFirst()
				 .orElse(null);
		
		System.out.println(secondHighest);
		
		
	}
}
