package in.nadeem.inheritance2;

public class SavingAccount extends Account {

	double interestRate;

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void CalculateInterest() {
		double interest = (balance * interestRate / 100);
		System.out.println("Interest Earned :: " + interest);
	}

}
