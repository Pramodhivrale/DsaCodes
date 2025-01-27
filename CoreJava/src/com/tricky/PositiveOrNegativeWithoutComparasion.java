package com.tricky;

public class PositiveOrNegativeWithoutComparasion {
	public static void main(String[] args) {
		int a = -10;
		String result = ((a >> 31) & 1) == 1 ? "Negative" : "Positive";
		System.out.println(result);
	}

}
