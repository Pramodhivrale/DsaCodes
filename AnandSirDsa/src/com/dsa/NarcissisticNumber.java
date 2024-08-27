package com.dsa;

import java.util.Scanner;

public class NarcissisticNumber {

	static void meth1(int num, int length) {
		int temp=num;
		int mul = 0;
		while (num != 0) {
           int lastDigit=num % 10;
           mul= (int) Math.pow(lastDigit, length) + mul;
           num =num / 10;
		}
		
		if(temp == mul) {
			System.out.println(temp+ " is Narcissistic Number");
			
		}
		else {
			System.out.println("Not --- NarcissisticNumber");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		String valueOf = String.valueOf(number);
		int length = valueOf.length();

		meth1(number, length);

	}

}
