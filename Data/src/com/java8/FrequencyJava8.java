package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	         
	        String nonreapeting= Arrays.stream(input.split(""))
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue() == 1)
	            .findFirst().get().getKey();
	            

	        System.out.println("nonreapeting characters: " + nonreapeting);
	        
		
		Q .Second highest number in array
		int arr[]= {5,6,8,10,6,16};
		Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
		
		Q .highest number in array
		Integer integer2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(integer2);
		
		
		
		Q .Create a java program to find longest string in given array ?
		String arr[]= {"pramod","maheshpatil","prahsnt","rutika","sanavipa"};
		 String string = Arrays.stream(arr).reduce((word1,word2)-> word1.length() > word2.length() ? word1 : word2).get();
		 System.out.println("longest string :"+string);
		 
		 */
		//Q. Find the number which starts with 1
		int arr[]= {5,6,8,10,6,16};
		
		List<String> collect = Arrays.stream(arr).boxed().map(s -> s + "").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println("Number starts with 1 :"+collect);
		
		//String join expamle
		List<String> asList = Arrays.asList("1","2","3","4");
		String join = String.join("-", asList);
		System.out.println("Final String :"+join);
		
		
		// 2-9 number and skip 8 element
		IntStream.rangeClosed(1, 10)
		         .skip(1)
		         .limit(8)
		         .forEach(System.out::println);
		
		//Print 1 to 20 using java-8
		 IntStream.range(1, 20).forEach(a->System.out.print(a+" "));
		
	        
	      
		
		
	}

}
