package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrGrtrThn5UpperCase {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("Kodewala","Java","Spring","Stream");
		
		List<String> itemsList = items.stream()
		     .filter(item -> item.length() > 5)
		     .map(item -> item.toUpperCase())
		     .sorted()
		     .collect(Collectors.toList());
		
		System.out.println(itemsList);
		
		// parallel processing using .parallelStream
		items.parallelStream()
		     .forEach(item -> System.out.println(Thread.currentThread().getName() + " - " + item));
	}
}
