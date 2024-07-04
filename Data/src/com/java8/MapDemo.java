package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapDemo 
{
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Pramod","Mahesh","sanu","rutu","jaya");
		
		//asList.stream().map(n -> n.toUpperCase()).forEach(i -> System.out.println(i+" "));
		
		//asList.stream().mapToInt(n-> n.length()).forEach(i->System.out.println(i));
	}

}
