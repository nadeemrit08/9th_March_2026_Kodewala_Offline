package in.nadeem.polymorphisom1;

public class UPIPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("UPIPayment.doPayment()");
	}
}
