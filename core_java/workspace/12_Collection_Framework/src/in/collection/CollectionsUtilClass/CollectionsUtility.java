package in.collection.CollectionsUtilClass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsUtility {

	public static void main(String[] args) {
		Map<String, String> products = new HashMap<String, String>();
		products.put("Apple", "ïphone16");
		products.put("Samsung", "s20");

		Map<String, String> newProducts = Collections.synchronizedMap(products);

		System.out.println(newProducts);
		// newProducts thread safe(500 buckets) --> 5th bucket is being updated ---> 499

		Map<String, String> concurrentProducts = new ConcurrentHashMap<String, String>(1000); // 999

		concurrentProducts.put("BLR", "test"); // 10th

		System.out.println(concurrentProducts);
	}
}
