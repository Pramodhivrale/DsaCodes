package com.data;

import java.util.Scanner;

public class SumOfNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int number=sc.nextInt();
		int sum=0;
		while(number != 0) {
			int rem=number % 10;
			number=number / 10;
			sum=sum+rem;
			
		}
		 System.out.println(sum);
		 sc.close();
		
	}

}
