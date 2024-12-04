package com.bitmanupulation;

public class CheckBitSetOrUnset {
	boolean checkbit(int n, int i) {
		// Right shift `n` by `i` positions and check the least significant bit
		return ((n >> i) & 1) == 1;
	}

	public static void main(String[] args) {
		CheckBitSetOrUnset checker = new CheckBitSetOrUnset();

		int number = 10; // Binary: 1010
		int bitIndex = 3; // Check if the 3rd bit (0-based index) is set

		boolean result = checker.checkbit(number, bitIndex);

		System.out.println("Is the " + bitIndex + "th bit set in " + number + "? " + result);
	}
}
