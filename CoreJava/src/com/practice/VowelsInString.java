package com.practice;

//  A E O U I
public class VowelsInString {
	public static void main(String[] args) {
		String input = "hello";
		String upperCase = input.toLowerCase();
		char[] charArray = upperCase.toCharArray();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'o' 
					|| charArray[i] == 'u'
					|| charArray[i] == 'i') {
				count++;
			}
		}

		System.out.println(count);
	}

}
