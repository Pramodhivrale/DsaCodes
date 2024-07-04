package com.dsa;

import java.util.Scanner;

public class PowerOFNumber 
{
	public static void main(String[] args) {
		System.out.println("enter a number to find poewer :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int power=1;
		for(int i=1;i<=3;i++)
		{
			power=power * num;
		}
		sc.close();
		System.out.println(power);
	}

}
