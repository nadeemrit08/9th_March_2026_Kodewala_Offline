package in.kodewala.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLstOfStrIntoSingleStr {

	public static void main(String[] args) {
		
		List<String> string = Arrays.asList("apple","banana","cherry");
		
		String collect = string.stream()
		      .collect(Collectors.joining(", "));
		
		System.out.println(collect);
	}
}
