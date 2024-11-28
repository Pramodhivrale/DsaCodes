package com.practice;

public class PalindromeCheckerRecurssion {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Recursive method to check if the string is a palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: If pointers have crossed, it means the string is a palindrome
        if (left >= right) {
            return true;
        }

        // Check if characters at current positions are equal
        if (str.charAt(left) != str.charAt(right)) {
            return false; // If not equal, it's not a palindrome
        }

        // Move pointers inward and check the next part of the string
        return isPalindrome(str, left + 1, right - 1);
    }
}

