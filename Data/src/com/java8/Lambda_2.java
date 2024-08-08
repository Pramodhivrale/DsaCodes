package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Insan {
	
	String name;
	Integer age;
	
	public Insan(String name,Integer age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Insan [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Lambda_2 
{
	public static void main(String[] args) {
		Insan p1=new Insan("Pramod", 26);
		Insan p2=new Insan("rutika", 20);
		Insan p3=new Insan("komal", 19);
		Insan p4=new Insan("shibbani", 22);
		
		List<Insan> asList = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Insan> i= p -> p.age >=20;
		for(Insan in : asList) {
			if(i.test(in)) {
				System.out.println(in.name);
			}
		}
		
		
		
	}

}
