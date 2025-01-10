package com.data;

import java.util.Arrays;

public class StringArraySort 
{
	public static void main(String[] args) {
		String[] s= {"pramod","rutika","shivani","mahesh","kj","navin"};
		
		Arrays.sort(s);
		
		for(String names:s) {
			System.out.println(names+" ");
		}
	}

}
