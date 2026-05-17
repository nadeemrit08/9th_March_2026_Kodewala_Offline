package com.constructor.ecomerce;

class Product {

	int productid;
	String productName;
	double price;

	int quantity;
	String category;

	boolean inStock;
	float rating;
	long sellerContact;

	public Product(int productid, String productName, double price) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}

	public Product(int productid, String productName, double price, int quantity, String category) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public Product(int productid, String productName, double price, int quantity, String category, boolean inStock,
			float rating, long sellerContact) {

		super();

		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.inStock = inStock;
		this.rating = rating;
		this.sellerContact = sellerContact;
	}

}

public class ProductDriver {

	public static void main(String[] args) {

		Product product1 = new Product(101, "Pen", 10);

		Product product2 = new Product(102, "Cup", 120, 4, "Kitchen");

		Product product3 = new Product(103, "Laptop", 50000, 5, "Electronics", true, 4.5f, 8859245475L);

	}
}
