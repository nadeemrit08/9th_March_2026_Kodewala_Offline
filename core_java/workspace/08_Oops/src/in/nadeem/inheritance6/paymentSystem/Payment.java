package in.nadeem.inheritance6.paymentSystem;

public class Payment {

	public double amount;

	public Payment(double amount) {
		super();
		this.amount = amount;
	}

	public void processPayment(String mode) {
		System.out.println("Processing Payment via : " + mode);
	}

	public void connectToBank() {
		System.out.println("Payment.connectToBank()");
	}

	public void sendSMS(String mode) {
		System.out.println("SMS : " + mode + " Payment of " + amount + "successful");
	}

}
