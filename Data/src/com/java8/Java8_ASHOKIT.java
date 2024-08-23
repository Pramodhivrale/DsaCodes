package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8_ASHOKIT 
{
	public static void main(String[] args) {
		String name ="hello";
		
//		Map<String,List<String>> collect = Arrays.stream(name.split(""))
//				                                  .collect(Collectors.groupingBy(s->s));
//		System.out.println(collect);
//		
//		Map<String,Long> collect2 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect2);
//		
//		 List<String> duplicates = Arrays.stream(name.split(""))
//		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		            .entrySet().stream()
//		            .filter(entry -> entry.getValue() > 1)
//		            .map(Map.Entry::getKey)
//		            .collect(Collectors.toList());
//
//		        System.out.println("Duplicate characters: " + duplicates);
	}


}
