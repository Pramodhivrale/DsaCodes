package com.java8;

import java.util.function.BiFunction;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> add=
				(a,b)-> a + b ;
				
	    System.out.println(add.apply(10, 20));
	    
	   BiFunction<Integer, Integer, Integer> d= (a,b)->a +b;
	   Integer apply = d.apply(10, 85);
	   System.out.println(apply);
		
				

	}

}
