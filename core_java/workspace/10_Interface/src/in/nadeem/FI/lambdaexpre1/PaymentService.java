package in.nadeem.FI.lambdaexpre1;

@FunctionalInterface
interface PaymentProcessor {

	public abstract boolean processPayment(double amount);
}

public class PaymentService {

	public static void main(String[] args) {

		PaymentProcessor creaditCardPayment = amount -> {

			System.out.println("Processing Credit Card Payment: " + amount);

			return true;
		};

		boolean status = creaditCardPayment.processPayment(123.78);
		System.out.println("Payment Succesfulll..... " + status);
	}
}
