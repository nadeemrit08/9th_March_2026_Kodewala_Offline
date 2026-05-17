package in.nadeem.polymorphisom1.overloadiing;

public class Login {

	public boolean doLogin(String userName) {
		System.out.println("Login.doLogin(String userName)");
		return true;
	}

	public boolean doLogin(String userName, int pwd) {
		System.out.println("Login.doLogin(String userName, double pwd)");
		return true;
	}

	public boolean doLogin(long number, int pwd) {
		System.out.println("Login.doLogin()");
		return true;
	}

}
