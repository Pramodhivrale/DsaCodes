package com.tricky;

public class Print1_100WithoutUsingLittrels {
	public static void main(String[] args) {
		char start = 'A';//65
		char end = 'd';//100
			
		for (int i = start - start + 1; i <= end-start+65; i++) {
			System.out.println(i);
		}
	}
}
