package in.nadeem.inheritance5;

public class Invoice extends Notifications {

	public void generateInvoice() {
		System.out.println("Invoice.generateInvoice()");

		// once invoice is generated, we need to send pdf over email
		sendEmail("nadeem123", "Please find attched invoice", "path for attched");
	}
}
