package com.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostOccuringWordsInString 
{
	public static void main(String[] args) {
		List<String> words=Arrays.asList(
				"Hello world",
				"Hello there",
				"world of programming",
				"hello world of java"
				);
		
		
		List<String> collect = words.stream().flatMap(s->Arrays.stream(s.split(" ")))
		.collect(Collectors.groupingBy(word -> word,Collectors.counting()))
		.entrySet().stream()
		.sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(3)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
