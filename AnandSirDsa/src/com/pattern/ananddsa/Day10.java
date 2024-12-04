package com.pattern.ananddsa;

//A
//AB
//ABC
//ABCD
//ABCDE
public class Day10 
{
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			char c='A';
			for(int j=0;j<=i;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}

}
