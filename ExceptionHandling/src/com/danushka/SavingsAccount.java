package com.danushka;

import java.math.BigDecimal;

public class SavingsAccount {
	
	public void deposit(Double amount) throws AccountException{
	
		if(amount<=0){
			throw new AccountException("Value cannot be less than zero");
		}
		else{
			System.out.println("Deposit Completed");
		}
	}
	
	public void withdraw(Double balance, Double amount) throws AccountValidationException{
		
		Validator validator = new Validator();
		try{
		if(validator.validate(balance, amount)){
			System.out.println("Successful");
		}
		}catch(AccountOverDueExceptio e){
			throw new AccountValidationException("Balance insufficent", e);
		}
	}

}
