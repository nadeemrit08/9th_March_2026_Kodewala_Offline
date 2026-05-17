package come.kodewala.continue_keyword;

public class ContinueExp {

	public static void main(String[] args) {

		String[] products = { "iPhone 16", null, "Google Pixel 9", "OnePlus 13", null, "Sony Xperia 1 VI",
				"Huawei Mate 60", "Oppo Find X7", "Vivo X100 Pro", "Realme GT 6", "Nothing Phone 3", "Motorola Edge 50",
				"Asus ROG Phone 8", "Lenovo Legion Phone 4", null, "Honor Magic 7", "Infinix Zero Ultra 2",
				"Tecno Phantom X3", null, "Redmi Note 14 Pro" };

		for (String product : products) {
			if (product == null || product.startsWith("Apple")) {
				continue; // skip the current iteration
			}

			// business logic
			System.out.println(product.toUpperCase());
		}
	}
}
