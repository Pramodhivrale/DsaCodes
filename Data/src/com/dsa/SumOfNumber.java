package com.dsa;

public class SumOfNumber 
{
	public static void main(String[] args) {
		int number=1234;
		
		String valueOf = String.valueOf(number);
		int sum=0;
		
		
		
		for(int i= 0;i<=valueOf.length()-1;i++) {
			sum=sum+valueOf.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
