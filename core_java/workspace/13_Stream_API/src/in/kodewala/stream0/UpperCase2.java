package in.kodewala.stream0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase2 {

	public static void main(String[] args) {

		List<String> brands = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme");

		// Convert a list into Upper case

		// Step-1 : convert the collection(list) to stream object
		Stream<String> stream = brands.stream();

		// Step-2 : Apply processing logic(Intermediate or Terminal)
		Stream<String> upperCaseList = stream.map(list -> list.toUpperCase());

		// Step-3 : collect the result and terminate the stream
		List<String> list = upperCaseList.collect(Collectors.toList());

		System.out.println("Upper case list : " + list);

		List<String> list2 = brands.stream()
								   .map(word -> word.toUpperCase())
								   .collect(Collectors.toList());
		System.out.println(list2);
	}
}
