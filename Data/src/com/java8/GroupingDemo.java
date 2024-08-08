package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class UserObj_1 {

	String empName;
	int empId;
	double salery;
	String country;

	public UserObj_1(String empName, int empId, double salery,String country) {
		this.empId = empId;
		this.empName = empName;
		this.salery = salery;
		this.country= country;
	}

	@Override
	public String toString() {
		return "UserObj_1 [empName=" + empName + ", empId=" + empId + ", salery=" + salery + ", country=" + country
				+ "]";
	}

	

}

public class GroupingDemo 
{
	public static void main(String[] args) {
		UserObj_1 user1 = new UserObj_1("Kishan", 1, 50000.50,"india");
		UserObj_1 user2 = new UserObj_1("Ashok", 2, 60000.50,"USA");
		UserObj_1 user3 = new UserObj_1("Mohan", 3, 40000.50,"China");
		UserObj_1 user4 = new UserObj_1("Deva", 4, 30000.50,"india");
		UserObj_1 user5 = new UserObj_1("Prashant", 5, 80000.50,"india");
		
		List<UserObj_1> asList = Arrays.asList(user1,user2,user3,user4,user5);
		
		Map<String,List<UserObj_1>> collect = asList.stream().collect(Collectors.groupingBy(e -> e.country));
		System.out.println(collect);
		
		
		
		
		
		
		
		
		
	}
	

}
