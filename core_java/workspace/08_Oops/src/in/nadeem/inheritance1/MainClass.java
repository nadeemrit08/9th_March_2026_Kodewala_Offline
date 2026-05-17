package in.nadeem.inheritance1;

public class MainClass {
	public static void main(String[] args) {
		Payment p1 = new UpiPayment(1500, "nadeem@upi");
		Payment p2 = new CardPayment(1200, "1234567812345678");
		p1.pay();
		p2.pay();

	}
}
