package in.nadeem.inheritance5;

public class Driver {

	public static void main(String[] args) {

		Notifications n = new Notifications();
		n.sendEmail("nadeemrit08", "order placed", "invoice.pdf");
		n.sendSMS("8859245465", "order delivered");
		
		Order order = new Order();
		order.placeOrder("nadeemrit08", "prod09", "xyz");
	}
}
