package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


class Demo{
	
	String name;
	String country;
	
	public Demo(String name,String country) {
		this.name=name;
		this.country=country;
		
		
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", country=" + country + "]";
	}
}
public class StreamMatchingDemo 
{
	public static void main(String[] args) {
		
		Demo d1=new Demo("Pramod","India");
		Demo d2=new Demo("Jhon","USA");
		Demo d3=new Demo("Trevis","Canada");
		Demo d4=new Demo("Michal","Uk");
		Demo d5=new Demo("Ghansham","India");
		
		List<Demo> asList = Arrays.asList(d1,d2,d3,d4,d5);
		
//		boolean anyMatch = asList.stream().anyMatch(name->name.country.equals("Uk"));
//		System.out.println(anyMatch);
		
//		Optional<Demo> first = asList.stream().filter(name -> name.country.equals("India"))
//		               .findFirst();
		
//		if(first.isPresent()) {
//		System.out.println(first.get());
//		}
	//=============================================================================	
	 List<Demo> collect = asList.stream().filter(i -> i.country.equals("India"))
	                .collect(Collectors.toList());
	 
	 System.out.println(collect.size());
	 collect.forEach(name->System.out.println(name));
	//=============================================================================== 
	 List<String> collect2 = asList.stream().filter(i->i.country.equals("India"))
	                .map(name -> name.name).collect(Collectors.toList());
	 
	 System.out.println(collect2);
		
	}

}
