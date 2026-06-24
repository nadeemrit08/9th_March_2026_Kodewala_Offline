package in.kodewala.stream0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListMulBy10 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 14, 15, 16, 18, 19);

		List<Integer> listMulBy10 = numbers.stream().map(n -> n * 10).collect(Collectors.toList());

		System.out.println(listMulBy10);
	}
}
