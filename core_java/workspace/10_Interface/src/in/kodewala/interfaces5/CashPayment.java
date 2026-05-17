package in.kodewala.interfaces5;

public class CashPayment implements HDFC, PNB {

	@Override
	public void payment() {
		System.out.println("CashPayment.payment()");
	}

}
