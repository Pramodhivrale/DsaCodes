package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExample
{
	void meth1()
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		hm.put(1, 5);
		hm.put(2, 6);
		hm.put(3, 9);
		hm.put(4, 2);
		hm.put(5, 4);
		
		HashSet<Object> hs=new HashSet<Object>(hm.entrySet());
		
		Iterator<Object> iterator = hs.iterator();
		while(iterator.hasNext()) {
			
			Entry next =(Entry) iterator.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}
		
	}
	public static void main(String[] args) {
		new HashMapExample().meth1();
	}

}
