package in.kodewala.interfaces6.marker1;

interface IDataPrintable { // Marker Interface

}

class Account implements IDataPrintable {
	int balance;
	String accountNo;
	String atmPin;

	public Account(int balance, String accountNo, String atmPin) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
		this.atmPin = atmPin;
	}

}

class DataProcessor {
	public void printDetails(Object obj) {

		if (obj instanceof IDataPrintable) { // it will be true id account class implement IDataPrintable
			Account acc = (Account) obj;
			System.out.println("Account no: " + acc.accountNo);
			System.out.println("ATM PIN: " + acc.atmPin);
			System.out.println("Balance: " + acc.balance);
		} else {
			System.err.println("DataNotPrintableException.....");
		}

	}
}

public class OwnMarkerInterface {

	public static void main(String[] args) {

		Account acc = new Account(1000, "123456", "8859");

		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.printDetails(acc);
	}
}
