package in.collection;

import java.util.Hashtable;
import java.util.Vector;

public class Driver_1 {

	public static void main(String[] args) {

		// creating instances of array, vector and hashtable
		int arr[] = { 1, 2, 3, 4, 5 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();

		v.add(1);
		v.add(2);

		h.put(1, "Kodewala");
		h.put(2, "Academy");

		System.out.println(arr[0]);
		System.out.println(v.get(0));
		System.out.println(h.get(1));
		
	}
}
