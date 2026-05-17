package in.nadeem.encapsulation4;

public class Driver {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.deposit(500);
		System.out.println(ac.getBalance());
	}
}
