package org.dsa;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{

			for(int ws=1;ws<=n-r;ws++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		sc.close();
	}

}
