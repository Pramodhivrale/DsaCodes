package com.bitmanupulation;

public class CountSetBits {

    // Method to count the number of set bits
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Clear the least significant set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountSetBits counter = new CountSetBits();

        int number = 29; // Binary: 11101
        int result = counter.countSetBits(number);

        System.out.println("Number of set bits in " + number + " is: " + result);
    }
}

