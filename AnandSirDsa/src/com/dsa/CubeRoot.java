package com.dsa;

import java.util.Scanner;

public class CubeRoot 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		double cbrt = Math.cbrt(n);
		System.out.printf("%.3f%n", cbrt);
		sc.close();
	}

}
