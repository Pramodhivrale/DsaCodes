package com.data;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Attempting to add values
        try {
            treeSet.add("abc");
            treeSet.add(null); // This will throw an exception in natural ordering
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot add null to TreeSet with natural ordering.");
        }

        // Print the TreeSet
        System.out.println("TreeSet contents: " + treeSet);
    }
}
