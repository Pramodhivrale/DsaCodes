package com.dsa;

public class ValidTrangle 
{
	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=4;
		
		if(a+b > c && b+c > a && a+c > b) {
			System.out.println("valid trangle");
		}
		else {
			System.out.println("Not a valid trangle");
		}
	}

}