package com.java8;

import java.util.function.Predicate;

public class LambdaExpression {

	public static void main(String[] args) {
		
	
		String names[]= {"pramod","pada","rutika","java"};
		
		Predicate<String> p= name -> name.charAt(0) == 'p';
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
		
		
	}
}
