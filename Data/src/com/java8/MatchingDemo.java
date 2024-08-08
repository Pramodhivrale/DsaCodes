package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class UserDataTwo {

	String name;
	String country;

	public UserDataTwo(String name,String country) {
      this.name=name;
      this.country=country;
	}

	@Override
	public String toString() {
		return "UserDataTwo [name=" + name + ", country=" + country + "]";
	}
	
	
}

public class MatchingDemo {
	public static void main(String[] args) {

		UserDataTwo d1=new UserDataTwo("Pramod","india");
		UserDataTwo d2=new UserDataTwo("Mahesh","USA");
		UserDataTwo d3=new UserDataTwo("Yash","UK");
		UserDataTwo d4=new UserDataTwo("Rutuika","China");
		UserDataTwo d5=new UserDataTwo("Yukta","Banlagdesh");
		UserDataTwo d6=new UserDataTwo("Rajkumar","india");
		
		List<UserDataTwo> asList = Arrays.asList(d1,d2,d3,d4,d5,d6);
		
		boolean anyMatch = asList.stream().anyMatch(p -> p.country.equals("india"));
		System.out.println(anyMatch);
		
		boolean allMatch = asList.stream().allMatch(p -> p.country.equals("USA"));
		System.out.println(allMatch);
		
		Optional<UserDataTwo> first = asList.stream().filter(p -> p.country.equals("india")).findFirst();
		System.out.println(first.get());
		
		
		Optional<UserDataTwo> any = asList.stream().filter(p -> p.country.equals("india")).findAny();
		System.out.println(any.get());
		
		List<String> collect = asList.stream().filter(p -> p.country.equals("india"))
		               .map(s -> s.name).collect(Collectors.toList());
		collect.forEach(abc -> System.out.println(abc));
	}

}
