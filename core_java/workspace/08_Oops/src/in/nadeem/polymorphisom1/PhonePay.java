package in.nadeem.polymorphisom1;

public class PhonePay extends Payment {

	@Override
	public void doPayment() {
		System.out.println("PhonePay.doPayment()");
	}
}
