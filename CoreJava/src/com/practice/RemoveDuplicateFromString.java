package com.practice;

import java.util.LinkedHashSet;
// Remove duplicate character
public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String input = "aabbccdd";

		LinkedHashSet<Character> hashset=new LinkedHashSet<Character>();
		for (char ch : input.toCharArray()) {
           hashset.add(ch);
		}
		System.out.println(hashset);

	}

}
