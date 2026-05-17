package in.nadeem.inheritance9.overloading3.upcasting1;

class InvoiceMgt {

}

class GSTInvoice extends InvoiceMgt {

}

public class Driver {

	public static void main(String[] args) {

		GSTInvoice gstInvoice = new GSTInvoice();

		InvoiceMgt invoiceMgt = (InvoiceMgt) new GSTInvoice(); // auto up casting

		GSTInvoice gstInvoice2 = (GSTInvoice) new InvoiceMgt(); // down casting
	}
}
