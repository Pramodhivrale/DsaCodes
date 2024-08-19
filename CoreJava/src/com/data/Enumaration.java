package com.data;

import java.util.Iterator;
import java.util.LinkedList;

public class Enumaration 
{
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(5);
		li.offer(85);
		
		Iterator<Integer> iterator = li.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
