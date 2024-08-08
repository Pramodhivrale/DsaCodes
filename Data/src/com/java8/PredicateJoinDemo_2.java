package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Data{
	
	String name;
	String dept;
	String location;
	
	public Data(String name,String dept,String location) 
	{
		this.name=name;
		this.dept=dept;
		this.location=location;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", dept=" + dept + ", location=" + location + "]";
	}
	
}

public class PredicateJoinDemo_2 {
	
	public static void main(String[] args) {
		
		Data p1 = new Data("Pramod", "Database", "Hyd");
		Data p2 = new Data("Akash", "Java", "Pune");
		Data p3 = new Data("Umesh", "Python", "Bengaluru");
		Data p4 = new Data("Akash", "AWS", "Hyd");
		
		List<Data> asList = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Data> predicate_1= person-> person.location.equals("Hyd");
		Predicate<Data> predicate_2= person -> person.dept.equals("AWS");
		
		Predicate<Data> and = predicate_1.and(predicate_2);
		
		for(Data d:asList) {
			if(and.test(d)) {
				System.out.println(d);
			}
		}
		
		
		
		
	}

}
