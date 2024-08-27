package com.dsa;

public class BinaryRepresentation
{
	public static void main(String[] args) {
		int num=12;
		
		String binaryRepesentaion="";
		
		while (num > 0) 
		{
			binaryRepesentaion=(num % 2 == 0 ? "0" : "1") + binaryRepesentaion;
			num =num / 2;
			System.out.println(num);
		}
		System.out.println("Binary :"+binaryRepesentaion);
		
		System.out.println("--------------------------------------------");
		int b=12;
		String binaryString = Integer.toBinaryString(b);
		System.out.println("Binary :"+binaryString);
	}
	
	

}
