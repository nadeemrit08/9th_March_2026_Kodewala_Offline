package com.kodewala.customException;

public class UserRegistration {

	public boolean registerUser(String _email) throws EmailAlradyExistsException {
		String email = _email;

		// logic to check the email...with database and if already available then return
		// true
		boolean isEmailRegistered = true;
		if (isEmailRegistered) {
			throw new EmailAlradyExistsException("Email Id " + email + " already registered");
		}
		return true;
	}
}
