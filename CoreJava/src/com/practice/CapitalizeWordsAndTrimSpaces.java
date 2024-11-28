package com.practice;

public class CapitalizeWordsAndTrimSpaces {
	public static void main(String[] args) {
		String input = "   hello   world   this is    java  ";
		String[] words = input.trim().split("\\s+");
		StringBuilder result = new StringBuilder();

		for (String str : words) {
			if (!str.isEmpty()) {
				result.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1).toLowerCase()).append(" ");

			}
		}
		System.out.println(result);

	}

}
