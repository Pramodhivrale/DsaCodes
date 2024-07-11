package com.codechef;

public class ConditionalStatement {
	public static void main(String[] args) {
		int a = 13;
		int b = 15;

		if (a >= b) {
			System.out.println(a + " is greater than or equal to " + b);
		} else if (a == b) {
			System.out.println(a + " is equal to " + b);
		} else {
			System.out.println(a + " is lesser than " + b);
		}

		a = 14;
		b = 14;

		if (a > b) {
			System.out.println(a + " is greater tha b " + b);
		} else if (a == b) {
			System.out.println(a + " is equal to " + b);
		} else {
			System.out.println(a + " is lesser than " + b);
		}
	}
}
