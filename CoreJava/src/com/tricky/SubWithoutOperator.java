package com.tricky;

public class SubWithoutOperator {
	public static void main(String[] args) {
		System.out.println(sub(20, 10)); // Expected output: 10
		System.out.println(sub(15, 5)); // Expected output: 10
		System.out.println(sub(7, 12)); // Expected output: -5
	}

	public static int sub(int a, int b) {
		while (b != 0) {
			// Calculate borrow using bitwise AND and negation
			int borrow = (~a) & b;

			// Perform subtraction using XOR
			a = a ^ b;

			// Shift the borrow left by 1 to carry it to the next higher bit
			b = borrow << 1;
		}
		return a;
	}
}
