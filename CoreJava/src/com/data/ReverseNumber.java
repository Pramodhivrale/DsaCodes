package com.data;

public class ReverseNumber 
{
	// 1.FIRST IMPLEMENTATION
	public static void main(String[] args) {
		int number=123;
		String valueOf = String.valueOf(number);
		for(int i=valueOf.length();i>0;i--) {
			System.out.print(i);
		}
	}
	
	

}
