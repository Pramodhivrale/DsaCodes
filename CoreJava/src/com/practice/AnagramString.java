package com.practice;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "adcb";

		if (checkifAnagram(a, b)) {
			System.out.println("It is anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

	private static boolean checkifAnagram(String a, String b) {
		a = a.replaceAll("\\s+", "").toLowerCase();
		b = b.replaceAll("\\s+", "").toLowerCase();
		if (a.length() != b.length()) {
			return false;
		}
		char[] charArray = a.toCharArray();
		char[] charArray2 = b.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray, charArray2);

	}

}
