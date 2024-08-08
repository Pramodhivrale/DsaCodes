package com.java8;

import java.time.Year;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String depertmanet;
	int yearOfjoining;
	double salary;
	
	public Employee(int id, String name, int age, String gender, String depertmanet, int yearOfjoining, double salary) {
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", depertmanet="
				+ depertmanet + ", yearOfjoining=" + yearOfjoining + ", salary=" + salary + "]";
	}
	
	
	

	
}
public class StreamApiFinalPractice 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0);
		Employee e2=new Employee(2, "Smita", 25, "male", "Sales", 2015, 13500.0);
		Employee e3=new Employee(3, "Devid", 29, "male", "Infrastrcutere", 2012, 18000.0);
		Employee e4=new Employee(4, "Orlen", 28, "male", "Developement", 2014, 32000.0);
		Employee e5=new Employee(5, "Charls", 27, "male", "HR", 2013, 22000.0);
		Employee e6=new Employee(6, "Cathey", 43, "Female", "Security", 2010, 25000.0);
		Employee e7=new Employee(7, "Ramesh", 35, "male", "Finance", 2016, 29000.0);
		Employee e8=new Employee(8, "Suresh", 31, "male", "Sales", 2023, 21000.0);
		Employee e9=new Employee(9, "Gita", 24, "Female", "Infrastrcutere", 2024, 25000.0);
		Employee e10=new Employee(10, "Mahesh", 38, "male", "Developement", 2019, 55000.0);
		Employee e11=new Employee(11, "Gouri", 27, "Female", "HR", 2011, 18000.0);
		Employee e12=new Employee(12, "Nitin", 25, "male", "Security", 2018, 25000.0);
		Employee e13=new Employee(13, "Swati", 27, "Female", "Finance", 2017, 22000.0);
		Employee e14=new Employee(14, "Buttlor", 24, "male", "Developement", 2016, 30000.0);
		Employee e15=new Employee(15, "Ashok", 23, "male", "Infrastrcutere", 2015, 29000.0);
		Employee e16=new Employee(16, "Sanavi", 26, "Female", "HR", 2024, 28000.0);
		
		List<Employee> empData = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16);
			
		Stream<Employee> filter = empData.stream().filter(i->i.salary==25000.0);
		List<Employee> collect = filter.collect(Collectors.toList());
		System.out.println(collect);
		
		

		
		
		

		
		
		
		
		
		
		
/* 
 Q .Find male and female emp and count them		
=> First way :-	
		
		
		long count = empData.stream().filter(e->e.gender.equals("male")).count();
		long count2 = empData.stream().filter(e -> e.gender.equals("Female")).count();

		System.out.println("Male and Female Employees Count :"+(count+count2));

=> Second way :-

		Map<String,Long> collect = empData.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect);
	
Q. print the name of all departments in the organization ?
 
  =>empData.stream()
		        .map(e->e.depertmanet)
		        .distinct()
		        .forEach(i->System.out.println(i));
		        
Q.Avg age of male and female employee ?
=> Map<String,Double> collect = empData.stream()
		       .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect);
		
Q. Get the details highest paid employee in organization ? 
=>		Optional<Employee> collect = empData.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		Employee employee = collect.get();
		System.out.println("Max salery :"+employee);
		
Q.Get the names of all employee who joined after 2015
=>      List<Employee> collect2 = empData.stream().filter(e->e.yearOfjoining > 2015).collect(Collectors.toList());
		collect2.forEach(name-> System.out.println(name+" "));


Q.Count the number of employees in each department ?

=>       Map<String,Long> collect = empData.stream()
		       .collect(Collectors.groupingBy(Employee::getDepertmanet,Collectors.counting()));
		System.out.println(collect);
		
Q. what is the average salary of each department ?	

=>	    Map<String,Double> collect = empData.stream()
		       .collect(Collectors.groupingBy(Employee::getDepertmanet,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect);
		
Q. Get the details of youngest male employee in the product development department ?

=>Optional<Employee> min = empData.stream()
		       .filter(e -> e.gender.equals("male") && e.depertmanet.equals("Developement"))
		       .min(Comparator.comparing(e->e.age));
		if(min.isPresent()) {
			Employee employee = min.get();
			System.out.println(employee);
		}

Q. Who has the most working experience in organization ?

=>	Optional<Employee> collect = empData.stream()
		       .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfjoining)));
		if(collect.isPresent()) {
			Employee employee = collect.get();
			System.out.println(employee);
		}

Q.How many male and female employees in the sales and marketing team ?

=>    Map<String,List<Employee>> collect = empData.stream()
		       .filter(e->e.depertmanet.equals("Sales"))
		       .collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(collect);
		
Q. what is the average salary of male and female employee ?

=>       Map<String,Double> collect = empData.stream()
		       .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(collect);
		
Q .List down the names of employee in each department ?

=>      Map<String,Map<String,List<Employee>>> collect = empData.stream()
		       .collect(Collectors.groupingBy(Employee::getDepertmanet,Collectors.groupingBy(Employee::getName)));
		System.out.println(collect+"/t");
		
Q. Sum of all the salaries ?

=>     DoubleSummaryStatistics collect = empData.stream()
               .collect(Collectors.summarizingDouble(Employee::getSalary));
		double sum = collect.getSum();
		System.out.println(sum);
		
Q. Second heights salary ?

=>		List<Employee> collect = empData.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		Employee employee = collect.get(1);
		System.out.println(employee);
		
		//Another way
		 * 
		 * 	Optional<EmployeeData> first = empData.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).skip(1).findFirst();
		    System.out.println(first.get().name);
				
*/
		
		
		
		
		
		
		
		
		
	}

}

















