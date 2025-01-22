package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmpData {
	int id;
	String name;
	int age;
	String gender;
	String depertmanet;
	int yearOfjoining;
	double salary;

	public EmpData(int id, String name, int age, String gender, String depertmanet, int yearOfjoining, double salary) {
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
		return "EmpData [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", depertmanet="
				+ depertmanet + ", yearOfjoining=" + yearOfjoining + ", salary=" + salary + "]";
	}
}

public class Java8Day9And10 {
	public static void main(String[] args) {
		EmpData e1 = new EmpData(1, "Alice Johnson", 25, "Female", "IT", 2020, 55000.00);
		EmpData e2 = new EmpData(2, "Bob Smith", 30, "Male", "Finance", 2018, 65000.00);
		EmpData e3 = new EmpData(3, "Charlie Brown", 28, "Male", "HR", 2019, 50000.00);
		EmpData e4 = new EmpData(4, "Daisy Carter", 32, "Female", "Admin", 2015, 48000.00);
		EmpData e5 = new EmpData(5, "Eve Taylor", 27, "Female", "IT", 2021, 60000.00);
		EmpData e6 = new EmpData(6, "Frank Wilson", 35, "Male", "Marketing", 2012, 70000.00);
		EmpData e7 = new EmpData(7, "Grace Davis", 29, "Female", "Finance", 2020, 55000.00);
		EmpData e8 = new EmpData(8, "Hank Thomas", 33, "Male", "Admin", 2016, 48000.00);
		EmpData e9 = new EmpData(9, "Ivy Lee", 24, "Female", "HR", 2022, 45000.00);
		EmpData e10 = new EmpData(10, "Jack Miller", 31, "Male", "IT", 2017, 62000.00);
		EmpData e11 = new EmpData(11, "Kathy Wilson", 26, "Female", "Marketing", 2019, 52000.00);
		EmpData e12 = new EmpData(12, "Liam Moore", 29, "Male", "Finance", 2020, 57000.00);
		EmpData e13 = new EmpData(13, "Mia White", 34, "Female", "HR", 2013, 49000.00);
		EmpData e14 = new EmpData(14, "Nate Harris", 27, "Male", "IT", 2021, 58000.00);
		EmpData e15 = new EmpData(15, "Olivia Martin", 30, "Female", "Admin", 2018, 47000.00);
		EmpData e16 = new EmpData(16, "Paul Walker", 32, "Male", "Marketing", 2016, 63000.00);
		EmpData e17 = new EmpData(17, "Quinn Young", 28, "Female", "Finance", 2019, 56000.00);
		EmpData e18 = new EmpData(18, "Riley Adams", 25, "Male", "HR", 2022, 46000.00);
		EmpData e19 = new EmpData(19, "Sophia Scott", 33, "Female", "IT", 2015, 61000.00);
		EmpData e20 = new EmpData(20, "Tyler Baker", 31, "Male", "Admin", 2017, 49000.00);
		EmpData e21 = new EmpData(21, "Uma Carter", 30, "Female", "Marketing", 2018, 54000.00);
		EmpData e22 = new EmpData(22, "Victor Hill", 35, "Male", "Finance", 2012, 68000.00);
		EmpData e23 = new EmpData(23, "Wendy Evans", 29, "Female", "HR", 2020, 53000.00);
		EmpData e24 = new EmpData(24, "Xander Phillips", 34, "Male", "IT", 2014, 59000.00);
		EmpData e25 = new EmpData(25, "Yara Green", 26, "Female", "Admin", 2021, 47000.00);
		EmpData e26 = new EmpData(26, "Zachary Turner", 30, "Male", "Marketing", 2018, 60000.00);
		EmpData e27 = new EmpData(27, "Amelia King", 28, "Female", "Finance", 2019, 56000.00);
		EmpData e28 = new EmpData(28, "Benjamin Hall", 27, "Male", "HR", 2021, 48000.00);
		EmpData e29 = new EmpData(29, "Chloe Fisher", 32, "Female", "IT", 2015, 62000.00);
		EmpData e30 = new EmpData(30, "David Collins", 33, "Male", "Admin", 2014, 50000.00);

		List<EmpData> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16,
				e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30);
		
		System.out.println("---------------------");
		// Male and female emp count
		long count = empList.stream().filter(emp->emp.getGender().equals("Female")).count();
		long count2 = empList.stream().filter(emp->emp.getGender().equals("Male")).count();
		System.out.println("Male and Female employees count :"+(count+count2));
		
		System.out.println("--------------------------");
		// Male and Female emp count [Second way]
		Map<String,Long> collect = empList.stream().collect(Collectors.groupingBy(EmpData::getGender,Collectors.counting()));
		System.out.println(collect);
		
		System.out.println("---------------------------");
		// Print the name of all depertments in the organization
		empList.stream().map(emp->emp.depertmanet).distinct().forEach(a->System.out.println(a+" "));
		
		System.out.println("-----------------------------");
		// avg age of male and female emp
		Map<String,Double> collect2 = empList.stream().collect(Collectors.groupingBy(EmpData::getGender,Collectors.averagingDouble(EmpData::getAge)));
		System.out.println(collect2);
		
		
		System.out.println("---------------------------");
		// Name of all emp who joined after 2015
		empList.stream().filter(emp->emp.getYearOfjoining() > 2015).collect(Collectors.toList())
		       .forEach(data->System.out.println(data.name+" "));
		
		System.out.println("-------------------");
		// No of emp in each department
		Map<String,Long> collect3 = empList.stream().collect(Collectors.groupingBy(EmpData::getDepertmanet,Collectors.counting()));
		System.out.println(collect3);
		
		System.out.println("--------------------");
		// Avg salery of each dept
		Map<String,Double> avgSalery = empList.stream().collect(Collectors.groupingBy(EmpData::getDepertmanet,Collectors.averagingDouble(EmpData::getSalary)));
		System.out.println(avgSalery);
		
		// Youngest male emp in HR dept
		System.out.println("----------------");
		Optional<EmpData> filter = empList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.age))).filter(dept->dept.depertmanet.equals("HR"));
		filter.ifPresentOrElse(
	            emp -> System.out.println("Max age employee in HR: " + emp),  // Action if value is present
	            () -> { throw new RuntimeException("No employee found in HR!"); } // Action if value is absent
	        );
		
		System.out.println("------------------------------------");
		
		// Youngest male emp in HR dept
		Optional<EmpData> min = empList.stream().filter(e->e.gender.equals("Male") && e.depertmanet.equals("HR"))
		       .min(Comparator.comparing(e->e.age));
		System.out.println(min.get());
		
		System.out.println("---------------------");
		//who has a most workin exp in organization
		Optional<EmpData> mostExp = empList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.yearOfjoining)));
        System.out.println(mostExp.get());	
        
        // Male and female emp in HR dept
        System.out.println("--------------------------");
         Map<String,Long> collect4 = empList.stream().filter(e->e.depertmanet.equals("HR"))
               .collect(Collectors.groupingBy(EmpData::getGender,Collectors.counting()));
         System.out.println(collect4);
         
         System.out.println("---------------------");
         // Avg salery of male female Emp
         System.out.println("---------------------------");
         Map<String,Double> avgSalery1 = empList.stream().collect(Collectors.groupingBy(EmpData::getGender,Collectors.averagingDouble(EmpData::getSalary)));
         System.out.println(avgSalery1);
         
         System.out.println("-----------------------");
         //Names of all emp in each dept
         Map<String,Map<String,List<EmpData>>> collect5 = empList.stream().collect(Collectors.groupingBy(EmpData::getDepertmanet,Collectors.groupingBy(EmpData::getName)));
         System.out.println(collect5);
         
         System.out.println("--------------------------");
         // avg salery and total salery of the whole dept
         DoubleSummaryStatistics collect6 = empList.stream().collect(Collectors.summarizingDouble(EmpData::getSalary));
         System.out.println("Avg salery of whole org :"+collect6.getAverage());
         System.out.println("total salery of org :"+collect6.getSum());
         
         System.out.println("------------------------");
         // seprate the employees who are younger or equal to 25 years from employess who are older than 25 years
         Map<Boolean,List<EmpData>> partition = empList.stream().collect(Collectors.partitioningBy(emp->emp.age>=25));
         System.out.println("Employees aged 25 or older: " + partition.get(true));
         System.out.println("Employees younger than 25: " + partition.get(false));     
         
         System.out.println("-----------------------");
         //Oldest employee in the orgnization
         Optional<EmpData> collect7 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.age)));
         System.out.println(collect7.get());
         
         System.out.println("---------------------");
         // second highest salery [First way]
         List<EmpData> collect8 = empList.stream().sorted(Comparator.comparing(EmpData::getSalary).reversed())
                .collect(Collectors.toList());
		EmpData empData = collect8.get(1);
		System.out.println(empData.getName());
		
		System.out.println("-----------------------");
		// second highest salery [Second way]
		Optional<EmpData> first = empList.stream().sorted(Comparator.comparing(EmpData::getName).reversed()).skip(1).findFirst();
		System.out.println(first.get());
		
		System.out.println("------------------------");
		// top highest 5 salery
		Stream<EmpData> limit = empList.stream().sorted(Comparator.comparing(EmpData::getSalary).reversed())
		       .limit(5);
		limit.forEach(System.out::println);   
	}
}
