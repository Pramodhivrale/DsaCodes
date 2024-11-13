package com.data;

import java.util.Scanner;

public class PrintUntilPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");

		int number;
		do {
			System.out.println("give a positive number");
			number = sc.nextInt();
		} while (number < 0);
		System.out.println("Positive number :"+number);
		sc.close();

	}

}
