package in.nadeem.inheritance7.overloading1;

public class InterestRateApplication {

	public static void main(String[] args) {

		HDFC application = new HDFC();
		application.interestRate();

		SBI sbi = new SBI();
		sbi.interestRate();

		PNB pnb = new PNB();
		pnb.interestRate();

	}
}
