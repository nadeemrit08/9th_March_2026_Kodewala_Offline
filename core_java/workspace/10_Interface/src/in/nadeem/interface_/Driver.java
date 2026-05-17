package in.nadeem.interface_;

interface KodewalaService {

	public static final String COMPANY_NAME = "Kodewala Academy";

	public static final int MAX_STUDENT = 1000;

	public abstract void provideService();
}

class KodewalaImplService implements KodewalaService {

	@Override
	public void provideService() {
		System.out.println("KodewalaImplService.provideService()");
	}

}

public class Driver {

	public static void main(String[] args) {

		KodewalaImplService service = new KodewalaImplService();

		service.provideService();

		System.out.println("Company Name: " + KodewalaService.COMPANY_NAME + " , " + " Max Student: "
				+ KodewalaService.MAX_STUDENT);

	}
}
