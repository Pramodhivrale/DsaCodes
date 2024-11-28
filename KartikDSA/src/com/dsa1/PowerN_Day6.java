package com.dsa1;

//Using recurssion
public class PowerN_Day6 {
	int power(int a, int n) {
		if (n == 0) {
			return 1;
		}
		return a * power(a, n - 1);
	}

	public static void main(String[] args) {
		PowerN_Day6 powerCalc = new PowerN_Day6(); // Create an instance of the class

		// Example inputs
		int base = 2;
		int exponent = 5;

		// Calculate power
		int result = powerCalc.power(base, exponent);

		// Print the result
		System.out.println(base + " raised to the power of " + exponent + " is: " + result);

	}

}
