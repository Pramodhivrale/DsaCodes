package com.dsa;

import java.util.Scanner;

public class SquereSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			int square = (int) Math.pow(i, 2);
			sum = sum + square;

		}
		sc.close();

		System.out.println(sum);
	}

}
