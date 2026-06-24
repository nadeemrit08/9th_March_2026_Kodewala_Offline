package in.kodewala.stream0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithALetter3 {

	public static void main(String[] args) {

		List<String> brands = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme");

		List<String> listStartWithS = brands.stream()
										    .filter(w -> w.startsWith("s"))
										    .collect(Collectors.toList());

		System.out.println("Brands starts with 'S' :: " + listStartWithS);
	}
}
