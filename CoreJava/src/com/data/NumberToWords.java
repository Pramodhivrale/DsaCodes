package com.data;

public class NumberToWords {
	public static String wordToNumber(char digit) {

		switch (digit) {
		case '0':
			return "Zero";
		case '1':
			return "One";
		case '2':
			return "Two";
		case '3':
			return "Three";
		case '4':
			return "Four";
		case '5':
			return "Five";
		case '6':
			return "Six";
		case '7':
			return "Seven";
		case '8':
			return "Eight";
		case '9':
			return "Nine";
		default:
			return "";

		}

	}

	@SuppressWarnings("unlikely-arg-type")
	public static String wordss(String number) {
		if (number.equals('0'))
			return "Zero";

		for (int i = 0; i < number.length(); i++) {
			char charAt = number.charAt(i);
			String wordToNumber = wordToNumber(charAt);
			System.out.print(wordToNumber + " ");
		}
		return null;

	}

	public static void main(String[] args) {
		String number = "1234";
		NumberToWords.wordss(number);
	}

}
