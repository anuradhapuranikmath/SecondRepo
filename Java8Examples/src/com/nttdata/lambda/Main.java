package com.nttdata.lambda;

public class Main {
public static void main(String[] args) {
	
	// old way
	Greet user1=new Greet();
	user1.greet(" Welcome to lambda ", "Anu");
	
	// lambda expression 
	
	Greeting g=(m,n)->
	{
	System.out.println(" Greeting as :"+n+" "+m);	
	};
	g.greet("Greeting using Lambda", "Tanu");
	
	
}
}
