package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class UserObj {

	String empName;
	int empId;
	double salery;

	public UserObj(String empName, int empId, double salery) {
		this.empId = empId;
		this.empName = empName;
		this.salery = salery;
	}

	@Override
	public String toString() {
		return "UserData [empName=" + empName + ", empId=" + empId + ", salery=" + salery + "]";
	}

}

public class MinMaxSaleryUsingJava8 {

	public static void main(String[] args) {
		UserObj user1 = new UserObj("Kishan", 1, 50000.50);
		UserObj user2 = new UserObj("Ashok", 2, 60000.50);
		UserObj user3 = new UserObj("Mohan", 3, 40000.50);
		UserObj user4 = new UserObj("Deva", 4, 30000.50);
		UserObj user5 = new UserObj("Prashant", 5, 80000.50);
		
		List<UserObj> asList = Arrays.asList(user1,user2,user3,user4,user5);
		
		Optional<UserObj> collect = asList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salery)));
		UserObj userObj = collect.get();
		System.out.println(userObj);
		
		Optional<UserObj> collect2 = asList.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salery)));
		System.out.println(collect2);
		
		
	}

	
	 
	
	
}
