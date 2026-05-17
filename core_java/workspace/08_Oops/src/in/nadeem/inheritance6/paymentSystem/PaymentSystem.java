package in.nadeem.inheritance6.paymentSystem;

public class PaymentSystem {

	public static void main(String[] args) {

		PhonePay phonePay = new PhonePay(1000);
		phonePay.processPayment("PhonePay");
		phonePay.connectToBank();
		phonePay.sendSMS("on PhonePay");

		System.out.println("---------------------------------------");

		Gpay p2 = new Gpay(2000);
		p2.processPayment("GPay");
		p2.connectToBank();
		p2.sendSMS(" On GPay");

		System.out.println("---------------------------------------");

		NetBanking netBanking = new NetBanking(3000);
		netBanking.processPayment("NetBanking");
		netBanking.connectToBank();
		netBanking.sendSMS("Net Banking");

		System.out.println("---------------------------------------");

		CreditCard card = new CreditCard(4000);
		card.processPayment("Credit Card");
		card.connectToBank();
		card.sendSMS("Creadit Card");

	}
}
