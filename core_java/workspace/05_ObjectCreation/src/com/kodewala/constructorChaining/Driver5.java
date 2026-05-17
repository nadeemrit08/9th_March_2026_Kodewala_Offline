package com.kodewala.constructorChaining;

// Constructor Chaining
class OrderMgmt {

	public OrderMgmt(String name) {
		super();
	}
}

class Order extends OrderMgmt {

	int amount;
	String itemName;
	int qty;
	String status;

	public Order(int _amount, String _itemName, int _qty) {
		this(_amount, _itemName, _qty, "PLACED"); // Constructor Chaining
		/*
		 * this.amount = _amount; this.itemName = _itemName; this.qty = _qty;
		 */
	}

	public Order(int _amount, String _itemName, int _qty, String _status) {
		super("some name"); // call Super class(OrderMgmt)
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	}

	@Override
	public String toString() {
		return "Order [amount=" + amount + ", itemName=" + itemName + ", qty=" + qty + ", status=" + status + "]";
	}

}

public class Driver5 {

	public static void main(String[] args) {

		Order ord = new Order(1000, "IPhone 17", 2);
		System.out.println(ord);
	}
}
