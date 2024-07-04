package com.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ObjectSorting 
{
	void meth1()
	{
		System.out.println("Sorting tha data based on Object");
		ArrayList<Object> al=new ArrayList<Object>();
		
		al.add(new ObjectsForSorting(4, "Pramod", "softwear engg"));
		al.add(new ObjectsForSorting(3, "Rutika", "Data engg"));
		al.add(new ObjectsForSorting(2, "Mahesh", "Business man"));
		al.add(new ObjectsForSorting(1, "Radha", "Doctoer"));
		
		Collections.sort(al, null);
		
		Iterator<Object> iterator = al.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		new ObjectSorting().meth1();
	}

}
