package com.data;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("An error occurred: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}

