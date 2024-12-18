package com.practice;

public class Example {
	private int instanceVariable = 10;

	public static void staticMethod() {
		// System.out.println(instanceVariable);

		// To access the non-static variable, you need to create an instance of the
		// class
		Example example = new Example();
		System.out.println(example.instanceVariable); // This works
	}

	public static void main(String[] args) {
		staticMethod();
	}
}
