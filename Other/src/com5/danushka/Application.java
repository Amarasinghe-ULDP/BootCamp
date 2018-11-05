package com5.danushka;

public class Application {
	
	public static void main(String args[]) {
		
		Verification verification = new Verification();
		Calculas cal = new Calculas();
		cal.addNum(verification);
		System.out.println(verification.isAnswer());
	}

}
