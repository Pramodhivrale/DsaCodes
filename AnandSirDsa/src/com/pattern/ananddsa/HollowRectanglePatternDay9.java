package com.pattern.ananddsa;

public class HollowRectanglePatternDay9 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 7; // Number of columns

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= cols; j++) { // Inner loop for columns
                // Print '*' for border cells
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for inner cells
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

