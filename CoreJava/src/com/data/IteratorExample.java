package com.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Step 1: Create a List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // Step 2: Get the Iterator
        Iterator<String> iterator = names.iterator();

        // Step 3: Use hasNext() and next() to iterate through the list
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) { // Check if there's a next element
        	System.out.println(iterator.next());
//            String name = iterator.next(); // Fetch the next element
//            System.out.println(name);
        }

        // Step 4: Remove an element using the Iterator
        iterator = names.iterator(); // Reset iterator
        System.out.println("\nRemoving elements starting with 'A':");
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); // Remove the element
                System.out.println(name + " removed.");
            }
        }

        // Step 5: Display the final list
        System.out.println("\nFinal List: " + names);
    }
}

