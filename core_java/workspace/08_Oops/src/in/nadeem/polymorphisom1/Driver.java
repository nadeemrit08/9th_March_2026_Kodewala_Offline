package in.nadeem.polymorphisom1;

public class Driver {

	public static void main(String[] args) {

		PaymentProcessor paymentProcessor = new PaymentProcessor();

		UPIPayment upiPayment = new UPIPayment();
		paymentProcessor.processPayment(upiPayment);

		PhonePay pay = new PhonePay();
		paymentProcessor.processPayment(pay);
	}
}
