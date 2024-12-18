package com.practice;

//Reverse a string without using third variable
public class ReverseString {
	public static void main(String[] args) {
		String name = "rutika";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
}
