package com.practice;

import java.util.Arrays;

public class StringIdenticalOrNot {
	public static void main(String[] args) {
		String name1 = "Hello World";
		String name2 = "Hello World";

		// First Way
		boolean equals = Arrays.equals(name1.toCharArray(), name2.toCharArray());
		System.out.println(equals);

		boolean checkidentical = checkidentical(name1, name2);
		System.out.println(checkidentical);

	}

	// Second way
	private static boolean checkidentical(String name1, String name2) {
		if (name1.length() != name2.length()) {
			return false;
		}
		for (int i = 0; i < name1.length(); i++) {
			if (name1.charAt(i) == name2.charAt(i)) {
				return true;
			}
		}
		return false;

	}

}
