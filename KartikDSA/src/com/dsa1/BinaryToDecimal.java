package com.dsa1;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String binaryString = scanner.nextLine();

		int decimalValue = binaryToDecimal(binaryString);

		System.out.println("Decimal value: " + decimalValue);

		scanner.close();
	}

	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int length = binary.length();

		for (int i = 0; i < length; i++) {
			// Get the character at position i
			char bit = binary.charAt(length - 1 - i);
			// Convert character to integer (0 or 1)
			int bitValue = Character.getNumericValue(bit);
			// Calculate the decimal value
			decimal += bitValue * Math.pow(2, i);
		}

		return decimal;
	}

}
