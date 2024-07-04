package com.dsa;

import java.util.Scanner;

public class HarshadNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			sum = sum + r;

		}
		int reminderr=temp % sum;
		System.out.println(reminderr);
		if(reminderr == 0) {
			System.out.println("This is harshad number..");
		}else {
			System.out.println("This is not a harshad number..");
		}
		sc.close();
	
	}
	

}
