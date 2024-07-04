package com.recurssion;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int fac=sc.nextInt();
		int fact=findFact(fac);
		System.out.println(fact);
	}

	private static int findFact(int num) {
		if(num >= 1) {
			return num * findFact(num-1);
		}
		else
		return 1;
	}

}
