package com.danushka;

public class AccountValidationException extends AccountException {
	
	public AccountValidationException(String message){
		super(message);
	}
	
	public AccountValidationException(String message, Throwable cause){
		super(message, cause);
	}
}
