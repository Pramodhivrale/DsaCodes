package com.dsa;

import java.util.Scanner;

public class MultipleOf5And3 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit :");
		int lowerLimit=sc.nextInt();
		System.out.println("Enter upper limit :");
		int upperLimit=sc.nextInt();
		int count=0;
		
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(i % 5 ==0 && i % 3== 0) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
		
	}

}
