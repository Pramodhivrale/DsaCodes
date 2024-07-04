package com.java8;

import java.util.ArrayList;

public class StreamApi2 
{
	void meth1()
	{
		
			ArrayList<String> al=new ArrayList<String>();
			al.add("Pramod");
			al.add("Rutika");
			al.add("Mahadev");
			al.add("ganesha");
			
//              Stream<String> stream = al.stream();
//              Stream<String> filter = stream.filter(data->data.length()>6);
//              long count = filter.count();
//              System.out.println(count);
//              
              long count2 = al.stream().filter(data->data.length()>5).count();
              System.out.println(count2);
	}
	public static void main(String[] args) {
	
		new StreamApi2().meth1();
		
	}

}
