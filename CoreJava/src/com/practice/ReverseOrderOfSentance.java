package com.practice;

public class ReverseOrderOfSentance 
{
	public static void main(String[] args) {
		String name="trees are beautifull";
		String[] split = name.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.println(split[i]);
		}
	}

}
