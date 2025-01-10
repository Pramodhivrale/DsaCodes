package com.data;

public class PalindromeRecurssion {
	public static void main(String[] args) {
		String name = "madam";

		boolean checkpalindrome = checkpalindrome(name, name.length() - 1, 0);
		System.out.println(checkpalindrome);
	}

	private static boolean checkpalindrome(String name, int right, int left) {
          if(left >= right) {
        	  return true;
          }
          if(name.charAt(left) != name.charAt(right)) {
        	  return false;
          }
          return checkpalindrome(name, right-1, left+1);
	}

}
