package in.nadeem.inheritance2;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void showBalance() {
		System.out.println("Account Balance :: " + balance);
	}

}
