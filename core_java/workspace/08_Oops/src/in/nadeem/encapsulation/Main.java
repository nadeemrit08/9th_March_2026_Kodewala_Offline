package in.nadeem.encapsulation;

public class Main {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000);
		account.depositMoney(500);
		account.withdrawMoney(1200);

		System.out.println("Final Balance :: " + account.getBalance());
	}
}
