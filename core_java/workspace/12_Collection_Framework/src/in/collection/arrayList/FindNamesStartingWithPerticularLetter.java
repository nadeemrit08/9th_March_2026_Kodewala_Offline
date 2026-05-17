package in.collection.arrayList;

import java.util.ArrayList;

public class FindNamesStartingWithPerticularLetter {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Nadeem");
		names.add("Ahmad");
		names.add("raja");
		names.add("Rani");
		names.add("Asif");
		names.add(null);
		names.add(null);

		for (String findNameStartWithR : names) {
			if (findNameStartWithR != null && findNameStartWithR.toUpperCase().startsWith("R")) {
				System.out.println(findNameStartWithR);
			}
		}
	}
}
