package com.practice;

public class RmSpecialCharacterfromString {
	public static void main(String[] args) {
		String s = "pram@#mod#";

		StringBuilder builder = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
             builder.append(ch);
			}
		}
		System.out.println(builder.toString());
	}

}
