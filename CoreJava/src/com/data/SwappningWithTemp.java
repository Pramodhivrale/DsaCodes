package com.data;

public class SwappningWithTemp 
{
	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println(x+" "+y);
	}

}
