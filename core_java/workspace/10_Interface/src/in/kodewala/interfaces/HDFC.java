package in.kodewala.interfaces;

public class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void addapyee() {
		System.out.println("HDFC.addapyee()");
	}

	@Override
	public void modifyPayee() {
		System.out.println("HDFC.modifyPayee()");
	}

	@Override
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
	}

}
