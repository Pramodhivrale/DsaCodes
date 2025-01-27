package com.data;

public class NumberToWord {
	public static void main(String[] args) {
		int number = 100;
		String stringnumber = String.valueOf(number);
		towords(stringnumber);

	}

	public static void towords(String stringnumber) {
		for (int i = 0; i < stringnumber.length(); i++) {
			char charAt = stringnumber.charAt(i);
			String string = toString(charAt);
			System.out.print(string.toLowerCase()+" ");

		}
	}

	private static String toString(char charAt) {
		switch (charAt) {
		case '0': {
			return "ZERO";
		}
		case '1': {
			return "ONE";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + charAt);
		}
	}

}
