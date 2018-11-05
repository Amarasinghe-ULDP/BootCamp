package com.danushka;

public class A {

	public void show(){
		System.out.println("show in A");
	}
	
	public static void main(String args[]){
		A a1 = new B();
		a1.show();
		/*A a = new A();
		a.show();*/
		C c = new C();
		A a = (A)c;
		a.show();
	}
}