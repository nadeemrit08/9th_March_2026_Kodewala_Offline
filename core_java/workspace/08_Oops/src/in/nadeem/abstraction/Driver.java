package in.nadeem.abstraction;

public class Driver {

	public static void main(String[] args) {

		LoginService loginService = new LoginService();

		boolean doLogin = loginService.doLogin("myurer", "Nadeem@123");
		System.out.println(doLogin);

	}
}
