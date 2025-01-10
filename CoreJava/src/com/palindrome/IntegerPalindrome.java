package com.palindrome;

public class IntegerPalindrome {
	public static void main(String[] args) {
		int number = 1234;

		if(checkPalindrome(number)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	private static boolean checkPalindrome(int number) {
		int originalNumber = number;
		StringBuilder s = new StringBuilder();
		//int reversedNumber=0;
		while (number > 0) {
			int temp = number % 10;
			//reversedNumber=reversedNumber * 10 + temp;
			s.append(temp);
			number = number / 10;
		}
		String string = s.toString();
		int reverse = Integer.parseInt(string);
		return originalNumber==reverse;
		
	}

}
