package com.danushka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
	
	public void write() throws IOException{
		
		FileWriter fileWriter = new FileWriter("/home/user/java/Danushka/test.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		for(int x=0; x<10; x++){
			bufferedWriter.write("#"+x);
		}
		bufferedWriter.close();
	}
	public void read() throws IOException{
		
		FileReader fileReader = new FileReader("/home/user/java/Danushka/test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		while((line=bufferedReader.readLine())!=null){
			System.out.println(line);
		}
	}
}
