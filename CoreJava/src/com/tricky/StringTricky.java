package com.tricky;

public class StringTricky {
	public static void main(String[] args) {
		
//		String s="MultiThreading";
//		s.toUpperCase();
//		System.out.println(s);
		
		String s = "Concurrency";
		String modifiedString = s.toUpperCase().charAt(4) + s.substring(5);
		System.out.println(modifiedString);

	}

}
