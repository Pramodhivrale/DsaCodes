package com.java8;

import java.util.Arrays;
import java.util.List;

class Emp{
	
	String name;
	int age;
	double salery;
	
	public Emp(String name,int age,double salery) {
		this.name=name;
		this.age=age;
		this.salery=salery;
	}
}
public class MapDemo3 
{
	public static void main(String[] args) {
		
		Emp e1=new Emp("Pramod",26,8563.7);
		Emp e2=new Emp("Rutika",21,8000.00);
		Emp e3=new Emp("Sanavi",14,85245.25);
		Emp e4=new Emp("Shivani",29,8563.7);
		Emp e5=new Emp("Yukta",25,8000.00);
		Emp e6=new Emp("Gajnan",22,55000.25);
		
		List<Emp> asList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		asList.stream().filter(emp -> emp.salery > 50000.0)
		               .forEach(i -> System.out.println(i.name+" "+i.age));
		
		asList.stream().filter(emp-> emp.salery > 50000.0)
		               .map(name -> name.name +" "+name.age).forEach(i->System.out.println(i));
		
	
		
	}

}
