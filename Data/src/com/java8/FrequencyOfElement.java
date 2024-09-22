package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement
{
	public static void main(String[] args) {
		String input="hello";
		
		Map<String,List<String>> collect = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(s->s));
		System.out.println(collect);
		
		System.out.println();
		
		Map<String,Long> collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
		
		System.out.println();
		
		List<String> asList = Arrays.asList("Pramod","mahesh","Pramod");
		ConcurrentMap<String,Long> collect3 = asList.stream().collect(Collectors.groupingByConcurrent(Function.identity(),Collectors.counting()));
		System.out.println(collect3);
		
	}

}
