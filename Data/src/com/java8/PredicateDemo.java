package com.java8;

import java.util.function.Predicate;

public class PredicateDemo 
{
	
	
	public static void main(String[] args) {
		String names[]= {"pramod","mahesh","akash","rupesh","prashant"};
		
		 Predicate<String> pr= name->name.charAt(0)=='p';
		 
		 for(String n:names) {
			 if(pr.test(n)) {
				 System.out.println(n);
			 }
		 }

	}
	
	
}