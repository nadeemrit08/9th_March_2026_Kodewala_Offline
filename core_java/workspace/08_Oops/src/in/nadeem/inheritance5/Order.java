package in.nadeem.inheritance5;

public class Order extends Notifications { // Notifications IS-A parent for order class

	public void placeOrder(String userId, String productId, String someOtherInfo) {
		System.out.println("Order.placeOrder()");

		// Once order placed, System/platform need to send and update over email/phone

		String text = "Your Order has been successfully placed...!!!";
		sendEmail(userId, text, null); // parent class i m able to use.
		System.out.println(countryName);

	}

}
