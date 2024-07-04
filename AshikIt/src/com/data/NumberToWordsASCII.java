package com.data;
import java.util.Scanner;

public class NumberToWordsASCII {

    // Method to convert a single digit to words using ASCII
    private static String digitToWord(char digit) {
        switch (digit) {
            case '0': return "Zero";
            case '1': return "One";
            case '2': return "Two";
            case '3': return "Three";
            case '4': return "Four";
            case '5': return "Five";
            case '6': return "Six";
            case '7': return "Seven";
            case '8': return "Eight";
            case '9': return "Nine";
            default: return "";
        }
    }

    // Method to convert a number to words
    private static String numberToWords(String number) {
        if (number.equals("0")) return "Zero";

        int len = number.length();
        String words = "";

        for (int i = 0; i < len; i++) {
            char digit = number.charAt(i);
            words =words+ digitToWord(digit) + " ";
        }

        return words.trim();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        scanner.close();

        String words = numberToWords(number);
        System.out.println("Number in words: " + words);
    }
}
