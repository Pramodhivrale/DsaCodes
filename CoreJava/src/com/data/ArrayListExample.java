package com.data;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	void meth1()
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(1);
		al.add("Pramod");
		al.add('A');
		
//		for(Object o:al)
//		{
//			System.out.println(o);
//		}
		Iterator<Object> iterator = al.iterator();
		while (iterator.hasNext()) 
		{
			System.err.println(iterator.next());
			
		}
		
		
		
	}
	public static void main(String[] args) {
		new ArrayListExample().meth1();
	}

}
