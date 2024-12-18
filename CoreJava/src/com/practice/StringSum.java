package com.practice;

public class StringSum {
	public static void main(String[] args) {
		String number = "1234";
		findsum(number);
	}

	private static void findsum(String number) {
		int sum = 0;
		for (char ch : number.toCharArray()) {
			int numericValue = Character.getNumericValue(ch);

			sum = sum + numericValue;
		}
		System.out.println(sum);

	}

}
