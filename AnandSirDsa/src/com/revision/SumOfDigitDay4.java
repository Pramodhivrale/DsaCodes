package com.revision;

// Sum of digits
public class SumOfDigitDay4 {
	public static void main(String[] args) {
		int number = 555;
		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		System.out.println(sum);
		
		
	}

}
