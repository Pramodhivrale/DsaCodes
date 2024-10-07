package com.data;

public class ReverseString1 {
	public static void main(String[] args) {
		String s = "hello world";

		String[] split = s.split(" ");
		StringBuilder reverse = new StringBuilder();

		for (String word : split) {
			StringBuilder reverseString = new StringBuilder(word);

			reverse.append(reverseString.reverse().toString()).append(" ");
		}
		String trim = reverse.toString().trim();
		System.out.println(trim);

		swipe();
	}

	private static void swipe() {
		int a = 10;
		int b = 20;

		// WITHOUT TEMP VARIABLE
		// a = a + b;
		// b = a - b;
		// a = a - b;

		// WITH TMP VARAIBLE
		int temp = a;
		a = b;
		b=temp;
		System.out.println(a + " " + b);

	}

}
