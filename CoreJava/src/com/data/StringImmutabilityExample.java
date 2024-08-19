package com.data;

public class StringImmutabilityExample {
    public static void main(String[] args) {
        // Create an initial string
        String original = "Hello";

        // Modify the string by concatenating more text
        String modified = original.concat(" World");

        // Print the original and modified strings
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Check if the original and modified strings are the same
        if (original == modified) {
            System.out.println("Both strings are the same object.");
        } else {
            System.out.println("The strings are different objects.");
        }
    }
}

