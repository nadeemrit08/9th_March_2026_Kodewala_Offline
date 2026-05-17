package in.nadeem.inheritance9.overloading2;

public class Main {

	public static void main(String[] args) {

		PaymentService paymentService = new PaymentService();
		System.out.println(paymentService.makePayment(5000));

		System.out.println(paymentService.makePayment(10000, 1234567812345678L));

		System.out.println(paymentService.makePayment(12000, "nadeem@123`"));
	}
}
