package in.nadeem.encapsulation;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void depositMoney(double amount) {
		if (amount > 0) {
			balance += amount;
			
		} else {
			System.out.println("Invalid Amount...!!!");
		}
	}

	public void withdrawMoney(double amount) {
		if (amount > 0 && amount < balance) {
			balance -= amount;
		} else {
			System.out.println("Insuficient Amount");
		}
	}

}
