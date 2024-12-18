package com.practice;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating1 {
	public static void main(String[] args) {
		String inputString = "abcabcbb";
		int result = lengthOfLongestSubstring(inputString);
		System.out.println("Length of the longest substring without repeating characters: " + result); // Output: 3
	}

	private static int lengthOfLongestSubstring(String s) {
		HashSet<Character> charset = new HashSet<Character>();
		int start = 0;
		int maxlenght = 0;
		for (int end = 0; end < s.length(); end++) {
			while (charset.contains(s.charAt(end))) {
				charset.remove(s.charAt(start));
				start++;
			}
			charset.add(s.charAt(end));
			maxlenght = Math.max(maxlenght, end - start + 1);
		}
		return maxlenght;
	}

}
