package com.nttdata.lambda;

public class Greet implements Greeting{

	@Override
	public void greet(String message, String name) {
		
		System.out.println("Greeting as :"+message+" "+name);
		
	}
	
	
	

}
