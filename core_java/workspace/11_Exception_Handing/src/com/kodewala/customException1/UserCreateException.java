package com.kodewala.customException1;

public class UserCreateException extends RuntimeException {

	public UserCreateException(String msg) {
		super(msg);
	}
}
