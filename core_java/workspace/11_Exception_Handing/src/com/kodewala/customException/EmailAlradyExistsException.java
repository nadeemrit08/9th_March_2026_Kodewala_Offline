package com.kodewala.customException;

public class EmailAlradyExistsException extends RuntimeException{

	public EmailAlradyExistsException(String _message) {
		super(_message);
	}
}
