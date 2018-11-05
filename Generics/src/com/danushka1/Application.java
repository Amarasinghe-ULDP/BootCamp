package com.danushka1;

public class Application {

	public static void main(String args[]){
		
		/*Car car = new Car();
		Vehicle<Car> vehicle = new Vehicle<Car>(car);
		vehicle.drive();*/
		
		Jeep jeep = new Jeep();
		Vehicle<Jeep> vehicle1 = new Vehicle<Jeep>(jeep);
		vehicle1.drive();
		
		Integer[] intArray = {1,2,3,4};
		String[] strArray = {"A","B","C","D"};
		
		//int[] a = {1,2};
		
		Printer printer = new Printer();
		printer.print(intArray);
		printer.print(strArray);
	}
	
}
