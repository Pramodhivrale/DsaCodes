package com.revision;

import java.io.IOException;
import java.util.Scanner;

// Cube using binary search
public class CubeRootDay41 {
	public static void main(String[] args) throws IOException {

		// Read number of test cases
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			System.out.println("Enter a number to find the cube root:");
			long n = sc.nextLong();

			// Compute the cube root
			long res = cube(n);
			System.out.println("Cube root (integer part): " + res);
		}

		sc.close();
	}

	private static long cube(long n) {
		long low = 0; // Include 0 in the range for edge cases like n = 0
		long high = n;

		while (low <= high) {
			long mid = low + (high - low) / 2;
			long cube = mid * mid * mid;

			if (cube > n) {
				high = mid - 1; // Move to the left half
			} else if (cube < n) {
				low = mid + 1; // Move to the right half
			} else {
				return mid; // Found the cube root
			}
		}
		return -1; // Return -1 if n is not a perfect cube
	}
}
