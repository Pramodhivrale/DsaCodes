package com.data;

public class TypeCastingExample {
	public static void main(String[] args) {
		double largeValue = 123.456;

		int smallerValue = (int) largeValue;

		System.out.println("Original double value: " + largeValue); // Output: 123.456
		System.out.println("After casting to int: " + smallerValue); // Output: 123
	}
}
