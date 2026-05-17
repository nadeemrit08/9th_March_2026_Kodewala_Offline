package in.kodewala.interfaces3;

//2010(1.6)-->2012(wanted new feature "printPassBook")
interface IBanking {
	void pay();

	void settle();

	void cancelTransaction();

	default void printPassBook() {// Only rural Bank want implement
		System.out.println("IBanking.printPassBook() - default functionality");
	}
}

class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void cancelTransaction() {
		System.out.println("HDFC.cancelTransaction()");
	}

}

class PNB implements IBanking {

	@Override
	public void pay() {
		System.out.println("PNB.pay()");
	}

	@Override
	public void settle() {
		System.out.println("PNB.settle()");
	}

	@Override
	public void cancelTransaction() {
		System.out.println("PNB.cancelTransaction()");
	}

}

class RuralBank implements IBanking {

	@Override
	public void pay() {
		System.out.println("RuralBank.pay()");
	}

	@Override
	public void settle() {
		System.out.println("RuralBank.settle()");
	}

	@Override
	public void cancelTransaction() {
		System.out.println("RuralBank.cancelTransaction()");
	}

	@Override
	public void printPassBook() {
		System.out.println("RuralBank.printPassBook()");
		//IBanking.super.printPassBook();
	}

}

public class Driver {

	public static void main(String[] args) {

		RuralBank ruralBank = new RuralBank();
		ruralBank.printPassBook();
	}
}
