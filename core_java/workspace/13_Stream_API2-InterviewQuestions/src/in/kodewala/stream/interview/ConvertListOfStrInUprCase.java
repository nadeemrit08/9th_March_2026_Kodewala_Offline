package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStrInUprCase {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("nadeem", "ahmad", "raju", "suresh");

		/*
		 * 1. Convert List of Strings to Upper case
		 */
		List<String> strUpperCase = names.stream()
				                         .map(name -> name.toUpperCase())
				                         .collect(Collectors.toList());

		System.out.println(strUpperCase);
	}
}
