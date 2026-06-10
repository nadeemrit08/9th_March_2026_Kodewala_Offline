package map.hashMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {

		/*
		 * Task : Store city(value) and state(key)
		 */

		Map<String, String> stateAndCity = new HashMap<String, String>();

		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharastra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telengana", "Hyderabad"); // 5th bucket -- > 0(1) -- > "Telengana".hashCode() & 15 -- > 5th
													// index
		stateAndCity.put("Gujrat", "Ahmedabad");
		stateAndCity.put("Karnataka", "Bengaluru"); // No Duplicate Keys

		System.out.println(stateAndCity.get("Telengana"));

		/*
		 * Imp Interview Question : How does HashMap internally works 
		 * 									(OR)
		 * 							How put method works? 
		 * 									(OR)
		 * 							How does get() method works?
		 */
		System.out.println(stateAndCity);

		// Convert the map to set of entries
		Set<Entry<String, String>> entrySet = stateAndCity.entrySet();

		// Convert Entries to iterator
		Iterator<Entry<String, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
}
