package com.dsa;

public class ClosestSquare_Day19 {
	public static void main(String[] args) {
		int number = 30; // Replace with your number

		int closestSquare = findClosestSquare(number);
		System.out.println("Closest square: " + closestSquare);

		while (closestSquare > 0) {
			closestSquare--;
			System.out.println("Current value: " + closestSquare);
		}
	}

	private static int findClosestSquare(int number) {
		int count =0;
		int sqrt = (int) Math.sqrt(number);
		int lowerSquare = sqrt * sqrt;
		int rem=number -lowerSquare;
		count++;
		if(rem < 0) {
			number =rem;
		return findClosestSquare(rem);
		}
	    System.out.println(count);
		return 0;
		
	}
}
