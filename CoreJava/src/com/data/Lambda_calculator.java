package com.data;

public class Lambda_calculator {
	public static void main(String[] args) {

		Calculator add = (a, b) -> a + b;
		double operator = add.operator(10, 20);
		System.out.println(operator);

		Calculator divide = (a, b) -> {
			if (b == 0) {
				throw new IllegalArgumentException("Cannot divide by zero");
			}
			return a / b;
		};
		System.out.println(divide.operator(10, 0));

	}

}
