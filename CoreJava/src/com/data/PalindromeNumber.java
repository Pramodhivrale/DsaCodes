package com.data;

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void meth1(int start,int end) 
	{
		for(int i=start;i<=end;i++) {
			
			if (isPalindrome(i)) {
                System.out.println(i + " is a palindrome.");
            } else {
                System.out.println(i + " is not a palindrome.");
            }
		}
			
	}
    public static boolean isPalindrome(int number) 
    {
    	int originalnumber=number;
    	int reversedNumber=0;
    	
    	
    	 while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            System.out.print(reversedNumber+" ");
	            number=number/10;
	        }
    	 
		return originalnumber==reversedNumber;
    	
    	
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range :");
		int start=sc.nextInt();
		
		System.out.println("Enter ending range :");
		int end=sc.nextInt();
		
		meth1(start,end);
		sc.close();
		
	}
	

}
