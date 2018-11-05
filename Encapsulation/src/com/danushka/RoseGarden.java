package com.danushka;

import java.util.ArrayList;

public class RoseGarden {
	
	public static ArrayList<Rose> roses;
		
		{
			roses = new ArrayList<>();
			roses.add(new Rose("Red", "Lovers Rose"));
		}
		
	public RoseGarden(){
		
	}
	
	public RoseGarden(String name, String color, int nor){
		for(int x=0; x<nor; x++){
			roses.add(new Rose(color, name));
		}
	}
	
	public void addRose(String color, String name){
		roses.add(new Rose(color, name));
	}
	
	public void getRoses(){
		
		class RoseValidator{
			
			public void validate(String name){
				if("Red".equalsIgnoreCase(name)){
					System.out.println("valid");
				}else{
					System.out.println("invalid");
				}
				
			}
		}
		
		for(Rose rose:roses){
			System.out.println(rose.toString());
		}
		
		new RoseValidator().validate("red");
	}
	class Rose {

		String color;
		String name;
		
		public Rose(String color, String name) {
			super();
			this.color = color;
			this.name = name;
		}
		
		@Override
		public String toString(){
			return "name :" + name + "color: " + color;
		}
		
		
	}
}



