package in.nadeem.inheritance2;

public class Main {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(1200, 5);
		savingAccount.showBalance();
		savingAccount.CalculateInterest();
	}
}
