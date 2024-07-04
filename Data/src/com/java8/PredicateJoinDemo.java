package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Persons{
	
	String name;
	String dept;
	String location;
	
	public Persons(String name,String dept,String location) 
	{
		this.name=name;
		this.dept=dept;
		this.location=location;
	}
}

public class PredicateJoinDemo 
{
	public static void main(String[] args) {
		
		Persons p1=new Persons("Pramod", "Database", "Hyd");
		Persons p2=new Persons("Akash", "Java", "Pune");
		Persons p3=new Persons("Umesh", "Python", "Benglore");
		Persons p4=new Persons("Akash", "AWS", "Hyd");
		
		List<Persons> asList2 = Arrays.asList(p1,p2,p3,p4);
		
	    Predicate<Persons> data=	person -> person.location.equals("Hyd");
	    Predicate<Persons> data2=   person -> person.name.startsWith("A");
	    //Predicate<Persons> data3=   person -> person.dept.startsWith("Java");
	    
	    
	    
	    Predicate<Persons> and = data.and(data2);
	    
	    for(Persons pr:asList2) {
	    	if(and.test(pr)) {
	    		System.out.println(pr.name);
	    	}
	    }

	}
}
