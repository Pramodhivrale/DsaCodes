package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi3 {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);

		numbers.stream().filter(data -> data >= 40).forEach(i -> System.out.println(i));
		
		List<String> stringData = Arrays.asList("Pramod","mahesh","Akash","Umesh","Prashant");
		 stringData.stream().filter(data -> data.startsWith("A")).forEach(i -> System.out.println(i));
		
		
		
		
	}

}
