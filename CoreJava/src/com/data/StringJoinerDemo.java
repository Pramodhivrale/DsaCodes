package com.data;

import java.util.StringJoiner;

public class StringJoinerDemo 
{
	public static void main(String[] args) {
		
		StringJoiner s=new StringJoiner("-");
		
		s.add("com");
		s.add("pramod");
		s.add("it");
		
		System.out.println(s);
		
		StringJoiner s1=new StringJoiner("-","(",")");
		
		s1.add("com");
		s1.add("pramod");
		s1.add("it");
		
		System.out.println(s1);
		
	}

}
