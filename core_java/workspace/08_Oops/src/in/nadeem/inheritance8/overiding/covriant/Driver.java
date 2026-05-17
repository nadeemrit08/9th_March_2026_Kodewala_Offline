package in.nadeem.inheritance8.overiding.covriant;

class PymentSystem { // Super class of UPI

	GenericResponse doPayment(String accNo, int amount, String note) {
		System.out.println("PymentSystem.doPayment()");
		return new GenericResponse("default payment");
	}
}

class UPI extends PymentSystem {

	@Override
	UPIResponse doPayment(String accNo, int amount, String note) {
		// change the functionalities
		System.out.println("UPI.doPayment()");
		return new UPIResponse("default payment", "200");
	}
}

public class Driver {

}
