package in.collection.arrayList;

import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(i).equals(numbers.get(j))) {
					System.out.println(numbers.get(i));
				}
			}
		}
	}
}
