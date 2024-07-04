package com.dsa;

public class SumOfDigit 
{
	public static void main(String[] args) {
		int digit=12345;
		int sum=0;
		while (digit != 0) {
			int r=digit % 10;
			digit=digit/10;
			sum=sum+r;
			
			 
		}
		System.out.println("Sum fo digit :"+sum);
	}

}
