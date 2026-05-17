package in.nadeem.encapsulation1;

public class ATM {

	private double balance = 1000;
	private String pin = "7860";

	public void withdrwa(double amountToWithdrw, String enteredPin) {

		System.out.println("Cureent Balance :: " + balance);

		if (enteredPin.equals(pin) && amountToWithdrw <= balance) {

			balance -= amountToWithdrw;
			System.out.println("Balance After Withdraw :: " + balance);

		} else {
			System.out.println("incorrect pin or insufficient balance");
		}
	}

	public void deposit(double amount, String enteredPin) {

		if (enteredPin.equals(pin)) {
			balance += amount;
			System.out.println(amount + " Deposited :: New Balance" + balance);
		}
	}
}
