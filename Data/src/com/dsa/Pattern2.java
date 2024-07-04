package com.dsa;

import java.util.Scanner;

public class Pattern2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int c=1;c<=n;c++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
