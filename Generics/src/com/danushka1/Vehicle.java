package com.danushka1;

public class Vehicle<T extends GroundVehicale> {
	
	T t;
	
	public Vehicle(T t){
		this.t=t;
	}
	
	public void drive(){
		System.out.println("I am driving a " + t.toString());
	}
	
}
