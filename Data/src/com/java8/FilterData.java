package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
/*
 * FIND MINIMUM AND AVG AND MAXIMUM SALERY OF EMPLOYESS ?
 * 
 */
class UserData{
	
	String empName;
	int empId;
	double salery;
	
	public UserData(String empName,int empId,double salery) 
	{
		this.empId=empId;
		this.empName=empName;
		this.salery=salery;
	}

	@Override
	public String toString() {
		return "UserData [empName=" + empName + ", empId=" + empId + ", salery=" + salery + "]";
	}
	
	
	
}
public class FilterData
{
	public static void main(String[] args) {
		
		UserData u1=new UserData("Kishan", 1, 50000.50);
		UserData u2=new UserData("Ashok", 2, 60000.50);
		UserData u3=new UserData("Mohan", 3, 40000.50);
		UserData u4=new UserData("Deva", 4, 30000.50);
		UserData u5=new UserData("Prashant", 5, 80000.50);
		
		List<UserData> asList = Arrays.asList(u1,u2,u3,u4,u5);
		
		Optional<UserData> collect = asList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salery)));
		System.out.println("Max Salery :"+collect);
		
		Optional<UserData> collect2 = asList.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salery)));
		System.out.println("Min Salery :"+collect2);
		
		Double collect3 = asList.stream().collect(Collectors.averagingDouble(e -> e.salery));
		System.out.println("Avg Salery :"+collect3);
		
		Map<Boolean,List<UserData>> collect4 = asList.stream().collect(Collectors.groupingBy(e -> e.salery >= 50000.00));
		System.out.println(collect4);
		
		
	}

}
