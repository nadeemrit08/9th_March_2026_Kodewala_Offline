package in.nadeem.polymorphisom;

class Delivery {

	public void doDeliver() {
		System.out.println("Delivery.doDeliver()");
	}
}

class EcomDelivery extends Delivery {

	@Override
	public void doDeliver() {
		System.out.println("EcomDelivery.doDeliver()");
	}
}

public class Driver {

	public static void main(String[] args) {

		Delivery delivery = new EcomDelivery(); // parent class can refer child class object(auto up casting)
		delivery.doDeliver(); // compile time it check + it call based on actual object
	}
}
