package com.kodewala.customException;

public class UserDefineException {

	public static void main(String[] args) {

		String email = args[0];

		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser(email);
		} catch (EmailAlradyExistsException e) {
			System.out.println("Email is already registered please connect with support team");
			e.printStackTrace();
		}

	}
}
