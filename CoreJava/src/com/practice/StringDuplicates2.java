package com.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class StringDuplicates2 
{
	public static void main(String[] args) {
		String s="pramodp";
		
		HashSet<Character> hashset=new HashSet<Character>();
		ArrayList<Character> duplicate=new ArrayList<Character>();
		
		for(char ch:s.toCharArray()) {
			if(!hashset.add(ch)) {
				duplicate.add(ch);
			}
		}
		duplicate.forEach(data->System.out.println(data+" "));
	}

}
