package in.kodewala.interfaces;

public class Driver {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.pay();
		sbi.settle();
		sbi.addapyee();
		sbi.modifyPayee();
		sbi.doKYC();
	}
}

