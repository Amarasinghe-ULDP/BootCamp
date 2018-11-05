package com2.danushka;

@ServiceConfiguration(defaultEndpoint = "localhost:8086", key="auth")
public class Service {
	
	public void invoke(String key){
		System.out.println("key is" + key);
	}

}
