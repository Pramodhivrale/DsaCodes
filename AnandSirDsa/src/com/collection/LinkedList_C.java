package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_C
{
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove(2);
		System.out.println(l);
		
		CustomeLinkedList cl=new CustomeLinkedList();
	    cl.add(10);
	    cl.add(20);
	    cl.add(30);
	}

}
