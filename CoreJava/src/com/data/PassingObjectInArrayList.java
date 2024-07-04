package com.data;

import java.util.ArrayList;
import java.util.Iterator;
public class PassingObjectInArrayList 
{
	void meth1()
	{
		ArrayList<Object> al=new ArrayList<Object>();
		
		P1 p=new P1(2, "Rutika");
		
		
		al.add(new P1(1,"pramod"));
		al.add(p);
		al.add(new P1(3,"Akash"));
		
		Iterator<Object> iterator = al.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
			
		}
		
	}
	public static void main(String[] args) {
		new PassingObjectInArrayList().meth1();
	}
	

}
