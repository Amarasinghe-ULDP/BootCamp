package com.danu.strategyPattern;

public class Executor {

	public static void main(String args[]){
		
	
		Duck dk = new Duck(new SimpleQuack());
		dk.quack("simple quack");
		Duck dk2 = new Duck(new NoQuack());
		dk2.quack("no quack");
		
		
		
		
	/*	Duck dk1 = new WildDuck();
		
		Duck dk2 = new CityDuck();
		
		System.out.println("wild Duck: " + dk1.quack());
		System.out.println("City Duck: " + dk2.quack());
		
		dk1.setQuackAbility(new SimpleQuack());
		
		System.out.println("wild Duck: " + dk2.quack());
	*/
	}
}
