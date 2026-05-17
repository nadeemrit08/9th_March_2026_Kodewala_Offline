package in.nadeem.inheritance7.overloading;

public class Driver {

	public static void main(String[] args) {

		PaymentSystem ps = new PaymentSystem();
		ps.pay();

		PaymentSystem ps1 = new GPay();
		ps1.pay();

		PaymentSystem ps2 = new PhonePay();
		ps2.pay();
	}
}
