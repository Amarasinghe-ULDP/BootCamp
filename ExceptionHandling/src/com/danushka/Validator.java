package com.danushka;

public class Validator {
	
	public boolean validate(double balance, double amount) throws AccountOverDueExceptio{
		
		if(balance<=0){
			throw new AccountOverDueExceptio("This acount is overdue");
		}
		else{
			return true;
		}
	
	}

}
