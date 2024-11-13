package com.dsa1;

public class BinaryToDecimal2 
{
	public static void main(String[] args) {
		int userNumber=10100;
		int rem=0;
		int dec=0;
		int base=1;
		while (userNumber>0) {
			rem=userNumber%10;
			dec=dec+(rem*base);
			userNumber=userNumber/10;
			base=base*2;//shift left for the next bit
		}
		System.out.println(dec);
	}

}
