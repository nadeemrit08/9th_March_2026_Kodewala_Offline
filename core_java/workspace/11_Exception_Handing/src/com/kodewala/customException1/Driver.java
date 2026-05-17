package com.kodewala.customException1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");

		User user = new User();
		try {
			user.createUser();
		} catch (UserCreateException e) {
			System.out.println("Unable to create user");
			e.printStackTrace();
		}
	}
}

class Account {
	void createAccount() throws FailedToCreateAccountException {
		System.out.println("Account.createAccount()  :: Start");

		if (true) {
			throw new FailedToCreateAccountException("unable to create account");
		}
		System.out.println("Account.createAccount() :: End");
	}
}

class User {

	public void createUser() throws UserCreateException {
		System.out.println("User.createUser() :: Start");

		if (true) {
			throw new UserCreateException("unable to create");
		}

	}

}
