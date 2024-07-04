package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(15);
		al.add(5);
		al.add(2);
		
		//al.forEach(abc ->System.out.println(abc));
		
//         Stream<Integer> stream = al.stream();	
//         Stream<Integer> map = stream.map(i->i*2);
//         List<Integer> collect = map.collect(Collectors.toList());
//         System.out.println(collect);
		
//		List<Integer> collect = al.stream().map(i->i*2).collect(Collectors.toList());
//		System.out.println(collect);
		
//		Stream<Integer> sorted = al.stream().sorted();
//		List<Integer> collect = sorted.collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Integer> collect = al.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
	}
	public static void main(String[] args) {
		new StreamApi().meth1();
	}

}
