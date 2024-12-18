package com.practice;

// Find numbers of matching character in string
public class NumberOfMatchingCharInString {
	public static void main(String[] args) {
		String data1 = "abcd";
		String data2 = "sbcd";

		char[] charArray = data1.toCharArray();
		char[] charArray2 = data2.toCharArray();

		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray2.length; j++) {
				if (charArray[i] == charArray2[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
