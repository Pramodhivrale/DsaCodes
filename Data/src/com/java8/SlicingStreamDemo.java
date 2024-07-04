package com.java8;

/*
 * 1) flatMap()
 * 2) distinct()
 * 
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SlicingStreamDemo 
{
	public static void main(String[] args) 
	{
		List<String> asList = Arrays.asList("Rutika","Jayshree","Shivani","Mahesh","Rutika","Shivani");
		
		List<String> asList2 = Arrays.asList("Java","Python","AWS","JAvascript");
		
		List<List<String>> asList3 = Arrays.asList(asList,asList2);
		
//		Stream<String> flatMap = asList3.stream().flatMap(s->s.stream());
//		flatMap.forEach(i -> System.out.println(i));
		
//	asList3.stream().forEach(i->System.out.println(i));
		
		
//		asList.stream().distinct().forEach(i->System.out.println(i));
		
//		asList.stream().skip(4).forEach(i -> System.out.println(i));
		
		asList.stream().limit(3).forEach(name -> System.out.println(name));
		
		
		
		
		
		
		
	}

}
