package in.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateUsingIterator {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();

		students.add("Nadeem");
		students.add("Raja");
		students.add("Aman");
		students.add("Rani");
		students.add("John");
		students.add("Naeem");
		students.add("Kohli");
		students.add("Rehman");
		students.add("Mohit");
		students.add("Yaseen");
		
		Iterator<String> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
