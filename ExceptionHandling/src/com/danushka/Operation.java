package com.danushka;

public class Operation {
	
	public void save(double amount) throws RuntimeException{
		
		SavingsAccount savingAccount = new SavingsAccount();
		try {
			savingAccount.deposit(amount);
			
		} catch (AccountException e) {
			
			amount = amount * -1;
		}
		try {
			savingAccount.deposit(amount);
		} catch (AccountException e1) {
			
			throw new RuntimeException();
		}
	}
		public void get(double amount) throws AccountException {
			

			SavingsAccount savingsAccount = new SavingsAccount();
			try{
				savingsAccount.withdraw(-100.0, amount);
			}catch(AccountValidationException e){
				throw new AccountException("Account validation fail", e);
			}
			
		}
	}
