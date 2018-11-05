package com.danu.strategyPattern;

public class CityDuck extends Duck{
	
	public CityDuck(){
		//super();
		qb = new NoQuack();
	}

}
