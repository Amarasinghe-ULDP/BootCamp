package com.danu.strategyPattern;

public class SimpleQuack implements IQuackBehavior{

	@Override
	public void quack(String sound) {
		// TODO Auto-generated method stub
		System.out.println("Simple quack " + sound);
	}

	/*public String quack(){
		return "Simple quack";
	}*/
}
