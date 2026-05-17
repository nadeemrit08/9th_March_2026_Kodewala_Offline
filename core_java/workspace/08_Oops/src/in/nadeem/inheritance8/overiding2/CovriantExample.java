package in.nadeem.inheritance8.overiding2;

class Bank { // super
	Bank getBank() {
		System.out.println("Bank.getBank()");
		return new Bank();
	}
}

class SBI extends Bank {
	@Override
	SBI getBank() { // Covriant return type
		System.out.println("SBI.getBank()");
		return new SBI();
	}
}

class PNB extends Bank {
	@Override
	PNB getBank() {
		System.out.println("PNB.getBank()");
		return new PNB();
	}
}

public class CovriantExample {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.getBank();

		SBI sbi = new SBI();
		sbi.getBank();

		PNB pnb = new PNB();
		pnb.getBank();
	}
}
