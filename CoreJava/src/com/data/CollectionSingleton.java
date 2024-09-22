package com.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionSingleton{
    public static void main(String[] args) {
        // Create a singleton set
        Set<String> singletonSet = Collections.singleton("Hello, World!");

        // Print the singleton set
        System.out.println("Singleton Set: " + singletonSet); // Output: [Hello, World!]

        // Try to add an element to the singleton set
        try {
            singletonSet.add("Another element");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Integer arr[]= {8,5,2,4,5,6,4,5,6};
        
        List<Integer> asList = Arrays.asList(arr);
        int frequency = Collections.frequency(asList, 8);
        System.out.println(frequency);
    }
}
