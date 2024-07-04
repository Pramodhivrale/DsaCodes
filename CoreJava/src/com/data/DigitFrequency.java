package com.data;

public class DigitFrequency {
    void meth1() {
        int number = 123423;
        String valueOf = String.valueOf(number);
        int[] digitFrequency = new int[10]; // Array to store the frequency of digits 0-9

        for (int i = 0; i < valueOf.length(); i++) {
            int digit = valueOf.charAt(i) - '0'; // Convert character to digit
            digitFrequency[digit]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        new DigitFrequency().meth1();
    }
}
