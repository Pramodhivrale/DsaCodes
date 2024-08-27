package com.dsa;

import java.util.Scanner;

public class ValidTriangle 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a side a :");
		int a=sc.nextInt();
		System.out.println("Enter a side b :");
		int b=sc.nextInt();
		System.out.println("Enter a side c :");
		int c=sc.nextInt();
		
		//a + b > c && 
		
		if((a + b > c) && (a + c > b) && (b + c > a))
		{
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}
