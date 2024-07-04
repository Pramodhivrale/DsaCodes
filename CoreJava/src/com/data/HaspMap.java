package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HaspMap 
{
	void meth1()
	{
		HashMap<Object, Object> hm=new HashMap<Object, Object>();
		hm.put(1, "PrAMOD");
		hm.put(2, "Rutika");
		hm.put(3, "Sanavi");
		hm.put(4, "Ritesh");
		hm.put(5, "Deva");
		
		ArrayList<Object> al=new ArrayList<Object>(hm.entrySet());
		Iterator<Object> iterator = al.iterator();
		while (iterator.hasNext())
		{
	      Entry e=(Entry)iterator.next();
	      System.out.println(e.getKey()+" "+e.getValue());
			
		}
	}

}
