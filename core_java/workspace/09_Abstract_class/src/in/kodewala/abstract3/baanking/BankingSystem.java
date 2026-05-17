package in.kodewala.abstract3.baanking;

abstract class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public abstract void calculateInterest();

	public void show() {
		System.out.println("Current Balance: " + balance);
	}

}

class SavingAccount extends Account {

	double interestRate = 5.0;

	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	public void calculateInterest() {
		double interest = (balance * interestRate) / 100;
		balance += interest;
		System.out.println("Added Balance: " + balance);

	}
}

public class BankingSystem {

	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount(10000);
		savingAccount.show();
		savingAccount.calculateInterest();
		savingAccount.show();
	}
}
