package org.dsa;

import java.util.Scanner;

public class Pattern11 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number :");
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			char ch='A';
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print(ch+" ");
				ch++;	
			}
			ch--;
			for(int c=1;c<=r-1;c++)
			{
				System.out.print(--ch+"");
			}
			System.out.println();
		}
		sc.close();
	}

}
