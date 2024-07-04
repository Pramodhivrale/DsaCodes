package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamApi4 {
	

	public static void main(String[] args) {
		User u1 = new User("Pramod", 26);
		User u2 = new User("Mahesh", 25);
		User u3 = new User("Umeash", 24);
		User u4 = new User("Akash", 29);
		User u5 = new User("Arun", 22);
		User u6 = new User("Ritesh", 24);
		User u7 = new User("Dhage", 19);
		User u8 = new User("Ashok", 18);
		
		List<User> asList = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8);
		
		//asList.stream().filter(data -> data.age >= 25).forEach(i->System.out.println(i));
		
		asList.stream().filter(u -> u.name.startsWith("A") && u.age >= 25).forEach(i->System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class User {

	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
