package com.data;

public class DecimalToBinary {
	public static void main(String[] args) {
		int number = 10;

		// Meth-1 Using built in methods
		String binaryString = Integer.toBinaryString(number);
		System.out.println(binaryString);

		// Meth-2 Using manual conversion
		String decimalToBinary = decimalToBinary(number);
		System.out.println(decimalToBinary);
	}

	private static String decimalToBinary(int decimal) {
		StringBuilder s = new StringBuilder();
		if (decimal == 0) {
			return "0";
		}

		while (decimal > 0) {
			int remainder = decimal % 2;
			s.insert(0, remainder); // Insert at the beginning
			decimal = decimal / 2; // Update the decimal number
		}
		return s.toString();

	}

}
