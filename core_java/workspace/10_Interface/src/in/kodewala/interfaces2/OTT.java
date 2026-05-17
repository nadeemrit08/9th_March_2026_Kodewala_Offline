package in.kodewala.interfaces2;

interface IOTTs {
	void signUp();

	void login();

	void subscribe();

	void cancelSubscription();

}

class HotStar implements IOTTs {

	@Override
	public void signUp() {
		System.out.println("HotStar.signUp()");
	}

	@Override
	public void login() {
		System.out.println("HotStar.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("HotStar.subscribe()");
	}

	@Override
	public void cancelSubscription() {
		System.out.println("HotStar.cancelSubscription()");

	}

}

class Netfilix implements IOTTs {
	@Override
	public void cancelSubscription() {
		System.out.println("Netfilix.cancelSubscription()");
	}

	@Override
	public void signUp() {
		System.out.println("Netfilix.signUp()");
	}

	@Override
	public void login() {
		System.out.println("Netfilix.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("Netfilix.subscribe()");
	}
}

class SonyTv implements IOTTs {

	@Override
	public void signUp() {
		System.out.println("SonyTv.signUp()");
	}

	@Override
	public void login() {
		System.out.println("SonyTv.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("SonyTv.subscribe()");
	}

	@Override
	public void cancelSubscription() {
		System.out.println("SonyTv.cancelSubscription()");
	}

}

public class OTT {

	public static void main(String[] args) {

		SonyTv sonyTv = new SonyTv();
		sonyTv.signUp();
		sonyTv.login();
		sonyTv.subscribe();
		sonyTv.cancelSubscription();
		System.out.println("====================================");

		HotStar hotStar = new HotStar();
		hotStar.signUp();
		hotStar.login();
		hotStar.subscribe();
		hotStar.cancelSubscription();
		System.out.println("====================================");

	}
}
