package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacterInString {
	public static void main(String[] args) {
		String data = "pramodood";
		int count = 0;
		char mostRepeatedChar = '\0';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : data.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		System.out.println("Duplicate characters in the string:");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				count = entry.getValue();
				mostRepeatedChar = entry.getKey();
			}
		}
		System.out.println(mostRepeatedChar + " " + count);
	}

}
