package com.practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//Occurence of each character
public class OccurenceOfCharacter {
	public static void main(String[] args) {
		String name = "pramodpatil";

		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		for (char ch : name.toCharArray()) {
			result.put(ch, result.getOrDefault(ch, 0) + 1);
		}
		
		Set<Entry<Character,Integer>> entrySet = result.entrySet();
		System.out.println(entrySet);
	
		result.forEach((key,value)->{
			
			System.out.println(key+" "+value);
		});
		
		 result.forEach((key, value) -> {
	            System.out.println("Key: " + key + ", Value: " + value);
	        });
	}

}
