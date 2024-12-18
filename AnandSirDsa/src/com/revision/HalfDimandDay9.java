package com.revision;

public class HalfDimandDay9 {
	public static void main(String[] args) {
		// Upper half of the diamond
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 2; i >= 1; i--) { // Start from 2 to avoid repeating the middle row
			for (int j = 1; j <= i; j++) { // Print stars based on the row index
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
