package in.nadeem.abstraction;

public class LoginService {

	public boolean doLogin(String userId, String pwd) {

		// connect with database
		// Do encryption / decryption
		// business logic to validate users

		connectToDB();

		encrption();

		promptPasswordReset();

		validateUser();

		return true;
	}

	private void connectToDB() {
		System.out.println("LoginService.connectToDB()........!!!");
	}

	private void encrption() {
		System.out.println("LoginService.encrption()");
	}

	private void validateUser() {
		System.out.println("LoginService.validateUser()");
	}

	public void promptPasswordReset() {
		System.out.println("LoginService.promptPasswordReset()");
	}
}
