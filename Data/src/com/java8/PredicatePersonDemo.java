package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	int age;
	String name;

	public Person(Integer age, String name) {
		this.age = age;
		this.name = name;

	}
}

public class PredicatePersonDemo {
	public static void main(String[] args) {
		Person p = new Person(20, "sunnder");
		Person p1 = new Person(25, "mahesh");
		Person p2 = new Person(30, "Jethalal");
		Person p3 = new Person(24, "Tapu");

		ArrayList<Object> data = new ArrayList<Object>();

		List<Person> asList = Arrays.asList(p, p1, p2, p3);

		long count = asList.stream().filter(person -> person.age >= 18).count();
		System.out.println(count);

		/*
		 * Using predicate Predicate<Person> person= data -> data.age >= 18;
		 * 
		 * for(Person data : asList) { if(person.test(data)) {
		 * System.out.println(data.name); }
		 * 
		 * }
		 * 
		 */
	}

}
