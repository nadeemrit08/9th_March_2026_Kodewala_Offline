package in.kodewala.abstract2.ecomercesystem3;

//Abstract class
abstract class Delivery {

	String productName = "Mobile Phone";

	// Abstract method
	abstract void deliver();

	// Non-abstract method
	void showDetails() {
		System.out.println("Product: " + productName);
	}
}

class OnlineDelivery extends Delivery {

	void deliver() {
		System.out.println("Product delivered to your home.");
	}
}

//Main class
public class Main {
	public static void main(String[] args) {

		OnlineDelivery obj = new OnlineDelivery();

		obj.showDetails(); // non-abstract method
		obj.deliver(); // abstract method
	}
}
