package com.data;

public class MyClass 
{
	 static int x = 10;
	    static {
	        x = 20; // static initializer
	    }
	    
	    
	    public static void main(String[] args) {
			System.out.println("main");
			System.out.println(x);
		}
}
