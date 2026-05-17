package in.nadeem.inheritance1;

public class CardPayment extends Payment {

	private String cardNumber;

	public CardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	public void pay() {
		System.out
				.println("Paid " + amount + " Using card ending with " + cardNumber.substring(cardNumber.length() - 4));
	}

}
