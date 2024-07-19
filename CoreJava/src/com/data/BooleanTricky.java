package com.data;

public class BooleanTricky 
{
	public static void main(String[] args) {
		System.out.println(Boolean.parseBoolean("true")); //true
		System.out.println(new Boolean(null)); //false
		//System.out.println(new Boolean());	
		System.out.println(new Boolean("true"));  // true
		System.out.println(new Boolean("trUE"));  // true
		
	}

}
