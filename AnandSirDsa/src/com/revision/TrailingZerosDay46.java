package com.revision;

public class TrailingZerosDay46 {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		// To find trailing zeros we need to divide n by multiplye 
		// of 5 every time ex : 5,125,625 that whay we have taken 
		// condition like 
		// the condition in for loop used to stop loop when number is 
		// divided by i and less than or equal 1
		for (int i = 5; n / i >= 1; i = i * 5) {
			count = count + n / i;
		}
		System.out.println(count);

	}
}
