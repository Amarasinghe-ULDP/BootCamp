package com.danushka1;

public class Printer {
	
	public <E> void print(E[] arr){
		
		for(E e : arr){
			System.out.print(e);
		}
		System.out.println();
	}

}
