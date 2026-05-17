package in.kodewala.interfaces6.marker2;

interface SecureTransactionable { // Custom Marker Interface

}

class UPIPayment {
	String id = "upi@123";
}

class CardPayment implements SecureTransactionable {
	String id = "card@123";
}

class SecurityChecker {
	public static boolean requireOTP(Object object) {
		return object instanceof SecureTransactionable;

	}
}

class PaymentService {
	public void processPayment(Object object) {
		if (SecurityChecker.requireOTP(object)) {
			System.out.println("OTP Varification Require.......");
		} else {
			System.out.println("Processing normally");
		}
	}
}

public class CustomMarkerInterface {

	public static void main(String[] args) {

		PaymentService service = new PaymentService();

		UPIPayment upi = new UPIPayment();

		CardPayment card = new CardPayment();

		service.processPayment(upi);

		service.processPayment(card);
	}
}
