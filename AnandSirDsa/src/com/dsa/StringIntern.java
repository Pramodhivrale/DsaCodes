package com.dsa;

public class StringIntern {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
		System.out.println(str == str1);
		System.out.println(str.hashCode() + " " + str1.hashCode());
	}
}
