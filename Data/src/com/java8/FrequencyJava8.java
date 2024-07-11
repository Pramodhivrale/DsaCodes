package com.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyJava8 
{
	public static void main(String[] args) {
		
		String input ="Hello";
		
		/*
		 * Q.frequency of element
		Map<String,List<String>> collect = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(s->s));
		System.out.println(collect);
		
		Q.Frequency of each element
		Map<String,Long> collect = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		Q.duplicate elements in string
		 List<String> duplicates = Arrays.stream(input.split(""))
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		            .entrySet().stream()
		            .filter(entry -> entry.getValue() > 1)
		            .map(Map.Entry::getKey)
		            .collect(Collectors.toList());

		        System.out.println("Duplicate characters: " + duplicates);
		
		Q.Unique elements in String
		List<String> unique = Arrays.stream(input.split(""))
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue() == 1)
	            .map(Map.Entry::getKey)
	            .collect(Collectors.toList());

	        System.out.println("Duplicate characters: " + unique);
	        
	        
	        Q.First non repeating character
	          */
	        String nonreapeting= Arrays.stream(input.split(""))
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue() == 1)
	            .findFirst().get().getKey();
	            

	        System.out.println("Duplicate characters: " + nonreapeting);
	        
	      
		
		
	}

}
