package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap 
{
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Akash","Pramod","Ak","Shravn");
		
		List<String> asList1 = Arrays.asList("Pramod","Mahesh","sanu","rutu","jaya");
		
		List<List<String>> asList2 = Arrays.asList(asList,asList1);
		
		
		// Flat map
		
		Stream<Object> flatMap = asList2.stream().flatMap(s -> s.stream());
		
		flatMap.forEach(name-> System.out.println(name));
	}

}
