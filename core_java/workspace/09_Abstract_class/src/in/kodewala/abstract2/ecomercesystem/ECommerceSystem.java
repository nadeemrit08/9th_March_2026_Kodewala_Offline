package in.kodewala.abstract2.ecomercesystem;

//Abstract Class
abstract class Delivery {

	String orderId;
	String address;

	// Constructor
	public Delivery(String orderId, String address) {
		this.orderId = orderId;
		this.address = address;
	}

	// Abstract Method
	abstract void deliverPackage();

	// Non-Abstract Method
	public void trackPackage() {
		System.out.println("Tracking Order ID: " + orderId);
		System.out.println("Current Status: In Transit");
	}
}

class StandardDelivery extends Delivery {

	public StandardDelivery(String orderId, String address) {
		super(orderId, address);
	}

	@Override
	void deliverPackage() {
		System.out.println("Deliverd....!!!!");
		System.out.println("Delivering to: " + address);
	}
}

public class ECommerceSystem {

	public static void main(String[] args) {

		Delivery d1 = new StandardDelivery("ORD123", "Bangalore");

		d1.deliverPackage(); // abstract method
		d1.trackPackage(); // non-abstract method

	}
}
