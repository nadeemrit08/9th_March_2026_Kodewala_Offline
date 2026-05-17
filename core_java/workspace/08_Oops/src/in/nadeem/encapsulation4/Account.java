package in.nadeem.encapsulation4;

public class Account {

	private double balance = 1000;

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid Amount");
		}
	}

	public double getBalance() {
		return balance;
	}
}
