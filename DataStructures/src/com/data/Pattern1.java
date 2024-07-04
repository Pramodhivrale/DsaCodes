package com.data;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			 for (int j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }
			for(int c=1;c<=i;c++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
