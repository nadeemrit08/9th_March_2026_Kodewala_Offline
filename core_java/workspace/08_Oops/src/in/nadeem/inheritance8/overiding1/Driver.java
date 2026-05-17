package in.nadeem.inheritance8.overiding1;

class InterestRate { // Super class of SBI, PNB, HDFC
	void calculateInterestRate(int amount, int rateOfInterest) {
		System.out.println("InterestRate.calculateInterestRate()");
		int interest = (amount * rateOfInterest) / 100;
		System.out.println("Interest: " + interest);
	}
}

class SBI extends InterestRate {

	@Override
	public void calculateInterestRate(int amount, int rateOfInterest) {
		System.out.println("SBI.calculateInterestRate()");
		int interest = (amount * rateOfInterest) / 100;
		System.out.println("SBI Interest: " + interest);
	}
}

class PNB extends InterestRate {
	@Override
	public void calculateInterestRate(int amount, int rateOfInterest) {
		System.out.println("PNB.calculateInterestRate()");
	}
}

class HDFC extends InterestRate {
	@Override
	protected void calculateInterestRate(int amount, int rateOfInterest) {
		System.out.println("HDFC.calculateInterestRate()");
	}
}

public class Driver {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		sbi.calculateInterestRate(1000, 5);

		// PNB pnb = new PNB(); pnb.calculateInterestRate();

		// HDFC hdfc = new HDFC(); hdfc.calculateInterestRate();

	}
}
