package com.revision;

public class SumOfDigitDay4Part2 {
	public static void main(String[] args) {
		String digit = "123";
		int sum = 0;
		for (int i = 0; i < digit.length(); i++) {
			char ch = digit.charAt(i);
			sum = sum + ch - 48;

		}
		System.out.println(sum);
	}

}
