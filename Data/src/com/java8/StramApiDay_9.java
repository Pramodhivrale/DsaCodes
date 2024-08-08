package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeData {
	int id;
	String name;
	int age;
	String gender;
	String depertmanet;
	int yearOfjoining;
	double salary;

	public EmployeeData(int id, String name, int age, String gender, String depertmanet, int yearOfjoining,
			double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.depertmanet = depertmanet;
		this.yearOfjoining = yearOfjoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepertmanet() {
		return depertmanet;
	}

	public void setDepertmanet(String depertmanet) {
		this.depertmanet = depertmanet;
	}

	public int getYearOfjoining() {
		return yearOfjoining;
	}

	public void setYearOfjoining(int yearOfjoining) {
		this.yearOfjoining = yearOfjoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", depertmanet="
				+ depertmanet + ", yearOfjoining=" + yearOfjoining + ", salary=" + salary + "]";
	}

}

public class StramApiDay_9 {

	public static void main(String[] args) {

		EmployeeData e1 = new EmployeeData(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0);
		EmployeeData e2 = new EmployeeData(2, "Smita", 25, "male", "Sales", 2015, 13500.0);
		EmployeeData e3 = new EmployeeData(3, "Devid", 29, "male", "Infrastrcutere", 2012, 18000.0);
		EmployeeData e4 = new EmployeeData(4, "Orlen", 28, "male", "Developement", 2014, 32000.0);
		EmployeeData e5 = new EmployeeData(5, "Charls", 27, "male", "HR", 2013, 22000.0);
		EmployeeData e6 = new EmployeeData(6, "Cathey", 43, "Female", "Security", 2010, 25000.0);
		EmployeeData e7 = new EmployeeData(7, "Ramesh", 35, "male", "Finance", 2016, 29000.0);
		EmployeeData e8 = new EmployeeData(8, "Suresh", 31, "male", "Sales", 2023, 21000.0);
		EmployeeData e9 = new EmployeeData(9, "Gita", 24, "Female", "Infrastrcutere", 2024, 25000.0);
		EmployeeData e10 = new EmployeeData(10, "Mahesh", 38, "male", "Developement", 2019, 55000.0);
		EmployeeData e11 = new EmployeeData(11, "Gouri", 27, "Female", "HR", 2011, 18000.0);
		EmployeeData e12 = new EmployeeData(12, "Nitin", 25, "male", "Security", 2018, 25000.0);
		EmployeeData e13 = new EmployeeData(13, "Swati", 27, "Female", "Finance", 2017, 22000.0);
		EmployeeData e14 = new EmployeeData(14, "Buttlor", 24, "male", "Developement", 2016, 30000.0);
		EmployeeData e15 = new EmployeeData(15, "Ashok", 23, "male", "Infrastrcutere", 2015, 29000.0);
		EmployeeData e16 = new EmployeeData(16, "Sanavi", 26, "Female", "HR", 2024, 28000.0);

		List<EmployeeData> empData = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15,
				e16);

//		long count = empData.stream().filter(e -> e.gender.equals("male")).count();
//
//		long count2 = empData.stream().filter(e -> e.gender.equals("Female")).count();
//
//		System.out.println(count + count2);
//		
//		Map<String,Long> collect = empData.stream().collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.counting()));
//		System.out.println(collect);
//		
//		Stream<String> distinct = empData.stream().map(e -> e.depertmanet).distinct();
//		
//		distinct.forEach(e->System.out.println(e));

//		Map<String,Double> collect = empData.stream().collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.averagingInt(EmployeeData::getAge)));
//		System.out.println(collect);
		
//		List<EmployeeData> collect = empData.stream().filter(e -> e.yearOfjoining > 2015).collect(Collectors.toList());
//         collect.forEach(e -> System.out.println(e.getName()));
		
//		Optional<EmployeeData> collect = empData.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
//		System.out.println(collect.get().name);
//		
//		Map<String,Long> collect2 = empData.stream().collect(Collectors.groupingBy(EmployeeData::getDepertmanet,Collectors.counting()));
//		System.out.println(collect2);
//		
//        Map<String,Double> collect3 = empData.stream().collect(Collectors.groupingBy(EmployeeData::getDepertmanet,Collectors.averagingDouble(EmployeeData::getSalary)));
//        System.out.println(collect3);
		
//		Optional<EmployeeData> min = empData.stream().filter(e -> e.gender.equals("male") && e.depertmanet.equals("Developement"))
//		                .min(Comparator.comparing(e -> e.age));
//		System.out.println(min.get());
		
//		Map<String,List<EmployeeData>> collect = empData.stream().filter(e -> e.depertmanet.equals("Sales"))
//		                .collect(Collectors.groupingBy(EmployeeData::getGender));
//		System.out.println(collect);
		
//		Map<String,Double> collect = empData.stream().collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.averagingDouble(e -> e.salary)));
//		System.out.println();
		                
//		Map<String,Map<String,List<EmployeeData>>> collect = empData.stream().collect(Collectors.groupingBy(EmployeeData::getDepertmanet,Collectors.groupingBy(EmployeeData::getName)));
//		System.out.println(collect);
//		
//		DoubleSummaryStatistics collect2 = empData.stream().collect(Collectors.summarizingDouble(EmployeeData::getSalary));
//		System.out.println(collect2.getSum());
		
		List<EmployeeData> collect3 = empData.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect3.get(1));
		
		Optional<EmployeeData> first = empData.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).skip(1).findFirst();
		System.out.println(first.get().name);
	}
}
