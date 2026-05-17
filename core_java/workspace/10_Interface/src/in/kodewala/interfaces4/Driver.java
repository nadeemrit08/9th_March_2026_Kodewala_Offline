package in.kodewala.interfaces4;

interface EComSystem {
	void placeOrder(); // public abstract void

	void cancelOrder();

	void editOrder();

	default void generateInvoice() {
		System.out.println("EComSystem.generateInvoice()");
		// 500 + send SMS
		sendSMS();
	}

	public static void printInvoiceODF() {// common functionality
		// 200 line of code(connect to server(50)--> init print --> write to file -->
		// send to customer(25))
		connectServer();
		notifyCustomers();
		System.out.println("EComSystem.printInvoiceODF()");
	}

	public static void sendingNotification() { // common functionality
		connectServer(); // --> draft email --> send to customer
		notifyCustomers();
	}

	private static void connectServer() {
		// 50 lines
		System.out.println("EComSystem.connect()");
	}

	private static void notifyCustomers() {
		// 50 lines
		System.out.println("EComSystem.notifyCustomers()");
	}

	private void sendSMS() {
		System.out.println("EComSystem.sendSMS()");
		// 50 lines
	}
}

class Amazon implements EComSystem {

	@Override
	public void placeOrder() {

		System.out.println("Amazon.placeOrder()");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Amazon.cancelOrder()");
	}

	@Override
	public void editOrder() {
		System.out.println("Amazon.editOrder()");
	}

	@Override
	public void generateInvoice() {
		System.out.println("Amazon.generateInvoice()");
		printInvoiceODF("path to store pdf", "seller logo");
	}

	private void printInvoiceODF(String path, String companyLogo) {
		System.out.println("Amazon.printInvoiceODF()");
		EComSystem.printInvoiceODF();
	}
}

class Flipkart implements EComSystem {

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Flipkart.cancelOrder()");
	}

	@Override
	public void editOrder() {
		System.out.println("Flipkart.editOrder()");
	}

	@Override
	public void generateInvoice() {
		System.out.println("Flipkart.generateInvoice()");
		printInvoicePDF("path to store pdf", "seller logo");
	}

	private void printInvoicePDF(String path, String companyLogo) {
		System.out.println("Flipkart.printInvoicePDF()");
		EComSystem.printInvoiceODF();
	}
}

public class Driver {

	public static void main(String[] args) {

		EComSystem.printInvoiceODF();
	}
}
