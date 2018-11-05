package com.danu.strategyPattern;

public class Duck{

	IQuackBehavior qb;
	
	
	public Duck(IQuackBehavior qb){
		this.qb = qb;
	}

	public void quack(String sound){
		qb.quack(sound);
	}
	
/*	public String quack(){
		return qb.quack();
	}
	
	public void setQuackAbility(IQuackBehavior qb){
		qb = qb;
	}*/
	
	
}
