package com.dsa;

public class Recurssion_Day20 {

	public static int power(int a, int b) {

		int pow = 1;
		for (int i = 0; i < b; i++) {
			pow = pow * a;
		}
		return pow;
	}

	public static void main(String[] args) {
		int power = power(5, 3);
		System.out.println(power);
	}

}
