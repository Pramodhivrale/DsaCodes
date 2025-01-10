package com.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMultiLevelSorting2 {
	 private String name;
	    private int age;

	    public ComparatorMultiLevelSorting2(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', age=" + age + "}";
	    }

	    public static void main(String[] args) {
	        List<ComparatorMultiLevelSorting2> employeess = new ArrayList<>();
	        employeess.add(new ComparatorMultiLevelSorting2("Alice", 30));
	        employeess.add(new ComparatorMultiLevelSorting2("Bob", 25));
	        employeess.add(new ComparatorMultiLevelSorting2("Charlie", 30));
	        employeess.add(new ComparatorMultiLevelSorting2("David", 25));
	        
	        Comparator<ComparatorMultiLevelSorting2> ageThenNameComparator = Comparator
	                .comparingInt(ComparatorMultiLevelSorting2::getAge)
	                .thenComparing(ComparatorMultiLevelSorting2::getName);
	        
	        Collections.sort(employeess,ageThenNameComparator);
	        
	        for (ComparatorMultiLevelSorting2 employee : employeess) {
	            System.out.println(employee);
	        }
	    }
}
