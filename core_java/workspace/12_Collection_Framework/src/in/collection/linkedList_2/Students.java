package in.collection.linkedList_2;

import java.util.LinkedList;

public class Students {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Nadeem");
		linkedList.add("Ahmad");
		linkedList.add("Shubham");
		linkedList.add("Ritesh");
		linkedList.add("Shaqib");

		System.out.println(linkedList);
		linkedList.add(2, "Sahil");
		System.out.println(linkedList);
	}
}
