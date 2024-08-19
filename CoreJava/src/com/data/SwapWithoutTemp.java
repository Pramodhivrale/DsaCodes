package com.data;

public class SwapWithoutTemp 
{
	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		System.out.println("Before swap :" +a +" "+b);
		
		a = a + b;
		b= a-b;
		a=a-b;
		
		System.out.println("a :"+a +" b:"+b);
		
	}

}
