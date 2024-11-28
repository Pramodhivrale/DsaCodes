package com.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepetitiveCharactersStream 
{
	 public static void main(String[] args) {
		 String input = "programming";

	     // Find and print repetitive characters
	     List<Character> repetitiveCharacters = findRepetitiveCharacters(input);
	     System.out.println("Repetitive characters: " + repetitiveCharacters);
	}

	private static List<Character> findRepetitiveCharacters(String input) {
		return input.chars().mapToObj(c->(char)c)
				    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				    .entrySet().stream().filter(entry ->entry.getValue()>1)
				    .map(Map.Entry::getKey).collect(Collectors.toList());
	}

}
