package in.nadeem.polymorphisom1;

public class CardPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("CardPayment.doPayment()");
	}
}
