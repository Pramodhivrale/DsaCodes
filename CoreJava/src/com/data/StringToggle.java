package com.data;

public class StringToggle {
	public static void main(String[] args) {
		String name = "pRamoD";
		char[] charArray = name.toCharArray();
		StringBuilder toggle = new StringBuilder();
		for (char c : charArray) {
			if (Character.isUpperCase(c)) {
				toggle.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				toggle.append(Character.toUpperCase(c));
			}
		}
		System.out.println(toggle.toString());
	}

}
