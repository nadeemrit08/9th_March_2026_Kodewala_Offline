package com.kodewala.customException1;

public class FailedToCreateAccountException extends RuntimeException{

	public FailedToCreateAccountException(String msg) {
		super(msg);

	}
}
