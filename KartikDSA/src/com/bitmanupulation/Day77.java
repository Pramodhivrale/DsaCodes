package com.bitmanupulation;

//To set the x-th and y-th bits 

public class Day77 {

	public int solve(int x, int y) {
		return (1 << x) | (1 << y);
	}

	public static void main(String[] args) {
		Day77 obj = new Day77();

		// Test example
		int x = 2, y = 4;
		int result = obj.solve(x, y);

		System.out.println("Result: " + result); // Expected: 20
	}
}
