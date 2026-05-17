package in.nadeem.polymorphisom1;

public class AirtelMoney extends Payment {

	@Override
	public void doPayment() {
		System.out.println("AirtelMoney.doPayment()");
	}
}
