package com.dsa1;

public class Pattern_2Day3 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			char ch='A';
			for(int j=1;j<2*i;j++) {				
				if(j<i) {
					System.out.print(ch++);
				}
				else if (i == j) {
					System.out.print(ch);
				}
				else {
					ch--;
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}

}
