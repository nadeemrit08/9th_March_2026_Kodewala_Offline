package in.kodewala.interfaces;

public class SBI extends Object implements IBanking {

	@Override
	public void pay() {
		System.out.println("SBI.pay()");
	}

	@Override
	public void settle() {
		System.out.println("SBI.settle()");
	}

	@Override
	public void addapyee() {
		System.out.println("SBI.addapyee()");
	}

	@Override
	public void modifyPayee() {
		System.out.println("SBI.modifyPayee()");
	}

	@Override
	public void doKYC() {
		System.out.println("SBI.doKYC()");
	}

}
