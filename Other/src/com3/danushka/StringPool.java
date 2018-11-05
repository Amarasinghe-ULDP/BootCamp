package com3.danushka;

public class StringPool {

	public static void main(String args[]){
		
		String str1 = "danu";
		String str2 = "danu"; //refer same memory address of str1
		
		str1="kamal"; //make a new object in string pool and put kamal into it. Then take memory address of it and keep it in stack.
		
		System.out.println(str1);
		System.out.println(str2);
		
		String s = new String("danu");//make a new object in out of the pool and check whether string pool has same value or not. if it has, refer the memory address
									//if it has not a same value, make new object in string pool and put the value into it. Then refer the memory address of it and keep that memory address in object that lives in outer pool  .	
		System.out.println(s);
		
		s="Nimal";// in here, s check whether string pool has same value or not. if there is not a same value, make a new object and put the value into it. then change the memory address that previously keeping at object in outer string pool.  
		
		System.out.println(s);
	}
}
