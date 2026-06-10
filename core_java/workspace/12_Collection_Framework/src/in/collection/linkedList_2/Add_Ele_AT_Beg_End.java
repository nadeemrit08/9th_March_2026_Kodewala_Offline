package in.collection.linkedList_2;

import java.util.LinkedList;

public class Add_Ele_AT_Beg_End {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.add("Nadeem");
		names.addFirst("Raja");
		names.addLast("John");

		System.out.println(names);
	}
}
