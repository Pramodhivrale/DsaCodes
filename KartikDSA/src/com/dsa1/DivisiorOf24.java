package com.dsa1;

public class DivisiorOf24 {
	public static void main(String[] args) {
		int number = 24;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {

				count++;
			}
		}
		System.out.println("Count :" + count);
	}

}
