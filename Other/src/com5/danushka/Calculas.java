package com5.danushka;

public class Calculas{
	
	Integer answer, x=8, y=10;
	
	public void addNum(Verification verification){
		
		answer = x+y;
		if(answer.equals(18)){
			verification.setAnswer(true);
		}
	}

	
}

