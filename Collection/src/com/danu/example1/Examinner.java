package com.danu.example1;

import java.math.BigDecimal;

public class Examinner {

	
	public static void main(String args[]){
		
			Examinner ex = new Examinner();
			System.out.println(ex.toString());
		 BigDecimal a = BigDecimal.valueOf(10.33333);
		 BigDecimal c = BigDecimal.valueOf(10.44444444444444444444);
		 Integer b = 10;
//		 BigDecimal x = (BigDecimal)a+b;
		 BigDecimal x = a.add(c);
		 System.out.println(x);
		
		
		}  
	}
