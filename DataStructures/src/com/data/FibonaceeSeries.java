package com.data;

public class FibonaceeSeries 
{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=20;i++)
		{
			c= a + b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

}
