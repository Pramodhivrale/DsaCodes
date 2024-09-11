package com.data;

public class PalindromeString 
{
	public static void main(String[] args) {
		String name="madam";
		String result="";
		
		for(int i=name.length()-1;i>=0;i--) {
			result=result+name.charAt(i);
		}
		if(name.equals(result)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
