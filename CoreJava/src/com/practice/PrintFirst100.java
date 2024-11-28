package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintFirst100 
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=200;i++) {
			list.add(i);
		}
		
		List<Integer> subList = list.subList(0, 100);
		System.out.print(subList+" ");
	}

}
