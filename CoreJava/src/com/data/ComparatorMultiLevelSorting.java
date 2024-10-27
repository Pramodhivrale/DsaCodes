package com.data;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMultiLevelSorting {
    private String name;
    private int age;

    public ComparatorMultiLevelSorting(String name, int age) {
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
        List<ComparatorMultiLevelSorting> employees = new ArrayList<>();
        employees.add(new ComparatorMultiLevelSorting("Alice", 30));
        employees.add(new ComparatorMultiLevelSorting("Bob", 25));
        employees.add(new ComparatorMultiLevelSorting("Charlie", 30));
        employees.add(new ComparatorMultiLevelSorting("David", 25));

        // Sorting by age first, then by name if age is the same
        Comparator<ComparatorMultiLevelSorting> ageThenNameComparator = Comparator
                .comparingInt(ComparatorMultiLevelSorting::getAge)
                .thenComparing(ComparatorMultiLevelSorting::getName);

        Collections.sort(employees, ageThenNameComparator);

        System.out.println(employees);
    }
}

