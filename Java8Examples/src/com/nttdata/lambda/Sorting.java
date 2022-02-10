package com.nttdata.lambda;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(8);
		list.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(System.out::println);
	}

}
