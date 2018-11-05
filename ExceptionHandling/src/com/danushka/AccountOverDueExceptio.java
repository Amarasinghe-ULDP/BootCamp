package com.danushka;

public class AccountOverDueExceptio extends AccountException {
	
	public AccountOverDueExceptio(String message){
		super(message);
	}
	
	public AccountOverDueExceptio(String message, Throwable cause){
		super(message, cause);
	}

}
