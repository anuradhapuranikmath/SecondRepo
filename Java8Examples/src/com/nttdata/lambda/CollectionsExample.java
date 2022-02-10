package com.nttdata.lambda;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Good Morning");
		list.add("How r you");
		
		//I need names starting with G 
		
		list.stream().filter(name->name.endsWith("i")).forEach(System.out::print);
		
	}

}
