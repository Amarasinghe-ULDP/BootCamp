package com.danu.example1;

public class ArrayExample {

	
	public static void main(String args[]){
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = new int[8];
		
	/*	for(int i=0; i<4; i++){
		
			c[i] = a[i];
			//System.out.println(c[i]);
			c[i+1] = b[i];
			//System.out.println(c[i+1]);
		}*/
		
		for(int i=0; i<4; i++){
			
			c[i] = a[i];
		}
		for(int i=0; i<4; i++){
			
			c[i+1] = a[i];
		}
	}
	
}
