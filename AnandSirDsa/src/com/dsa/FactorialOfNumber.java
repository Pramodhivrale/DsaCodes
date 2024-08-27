package com.dsa;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int fact=1;
		 int num=sc.nextInt();
		 
		 for(int i=1;i<=num;i++)
		 {
             fact=fact * i;
		 }
		 System.out.println(fact);
		 sc.close();
		 
	}

}