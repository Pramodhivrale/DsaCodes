package com.practice;

public class RmSpecialCharacterfromString2 {
	public static void main(String[] args) {
		String s = "pram@#mo1d#";
		StringBuilder builder = new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				builder.append(ch);
			}
		}
		System.out.println(builder.toString());
	}

}
