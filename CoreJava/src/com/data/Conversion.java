package com.data;

public class Conversion 
{
	public static void main(String[] args) {
		int num=123;
		String valueOf = String.valueOf(num);
		System.out.println(valueOf.getClass().getName());
		
		
		// If String is in numeric format then it will not give an any exception
		String name="123";
		Integer valueOf2 = Integer.valueOf(name);
		System.out.println(valueOf2);
//		
		
		// This will give you number format exception
		String name1="Pramod";
		Integer valueOf21 = Integer.valueOf(name1);
		System.out.println(valueOf21);
		
	}

}
