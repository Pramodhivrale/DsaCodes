package com.dsa1;

import java.util.HashSet;

public class IsoGramString {
	public static void main(String[] args) {
		String input = "Dermatoglyphicss";
		boolean result = isIsogram(input);
		if (result) {
			System.out.println("The string \"" + input + "\" is an isogram.");
		} else {
			System.out.println("The string \"" + input + "\" is not an isogram.");
		}
	}

	private static boolean isIsogram(String input) {
		String lowerCase = input.toLowerCase();

		char[] charArray = lowerCase.toCharArray();
		HashSet<Character> stringchracter = new HashSet<Character>();

		for (char c : charArray) {
			if (stringchracter.contains(c)) {
				return false;
			}
			stringchracter.add(c);
		}
		return true;
	}
}
