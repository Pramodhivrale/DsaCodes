package com.tricky;

import java.util.Arrays;
import java.util.List;

public class TrickyConversion 
{
	public static void main(String[] args) {
		//String name="pramod";//Non numaric and it will throw exception
		String namee="123";// It will not throw exception and it will parse
		//If the string cannot be parsed (e.g., contains non-numeric characters), 
		//it throws a NumberFormatException.
		
		int int1 = Integer.parseInt(namee);
		System.out.println(int1);
		
		int int2 = Integer.parseInt(namee);
		System.out.println(int2);
		
		String n1="123a";
		int int3 = Integer.parseInt(n1);
		System.out.println(n1);
		
		
		// If array is object type then it will work otherwisw it will not work
		String arr[]= {"as","sas"};
		
		List<String> asList = Arrays.asList(arr);
		System.out.println(asList);
		
		Integer arr1[]= {1,2,3,4};
		List<Integer> asList2 = Arrays.asList(arr1);
		
		
	}

}
