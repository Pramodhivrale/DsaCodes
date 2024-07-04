package com.recurssion;

import java.util.Scanner;

public class AdditionOfPrime 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		int sum=addNumber(number);
		System.out.println(sum);
		sc.close();
	}

	private static int addNumber(int number) {
		
		if(number != 0) {
			return number+addNumber(number-1);
		}
		else {
			return number;
		}
	}

}
