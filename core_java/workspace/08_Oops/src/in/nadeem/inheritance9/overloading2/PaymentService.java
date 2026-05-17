package in.nadeem.inheritance9.overloading2;

public class PaymentService {

	// 1. Cash Payment
	public double makePayment(double amount) {
		validateAmount(amount);
		System.out.println("Payment Mode: Cash");
		return amount;
	}

	// 2. Card Payment
	public double makePayment(double amount, long cardNumber) {
		validateAmount(amount);
		System.out.println("Payment Mode: Card");
		System.out.println("Card Used: XXXX-XXXX-XXXX-" + (cardNumber % 10000));
		return amount;
	}

	// UPI Payment
	public double makePayment(double amount, String upiId) {
		validateAmount(amount);
		System.out.println("Payment Mode: UPI ");
		System.out.println("UPI id : " + upiId);
		return amount;
	}

	private void validateAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid Amount");
		}
	}
}
