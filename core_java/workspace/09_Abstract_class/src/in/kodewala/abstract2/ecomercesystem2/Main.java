package in.kodewala.abstract2.ecomercesystem2;

//Abstract class
abstract class Delivery {

	String productName;

	Delivery(String productName) {
		this.productName = productName;
	}

	abstract void deliver();

	// Non-abstract method
	void showDetails() {
		System.out.println("Product: " + productName);
	}
}

class OnlineDelivery extends Delivery {

	OnlineDelivery(String productName) {
		super(productName);
		// TODO Auto-generated constructor stub
	}

	// Implement abstract method
	void deliver() {
		System.out.println("Product delivered to your home.");
	}
}

//Main class
public class Main {
	public static void main(String[] args) {

		OnlineDelivery obj = new OnlineDelivery("Mobile Phone");

		obj.showDetails(); // calling normal method
		obj.deliver(); // calling abstract method
	}
}
