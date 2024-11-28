package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StringDuplicates {
	public static void main(String[] args) {
		String s = "pttamodp";

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		System.out.println("Duplicate characters in the string:");
		ArrayList<Object> arraylist = new ArrayList<Object>(charCountMap.entrySet());
		Iterator<Object> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println(next.getKey() + "   " + next.getValue());
		}

	}

}
