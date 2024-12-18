package com.practice;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, move the start pointer
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(end));
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String inputString = "abcabcbb";
        int result = lengthOfLongestSubstring(inputString);
        System.out.println("Length of the longest substring without repeating characters: " + result); // Output: 3
    }
}
