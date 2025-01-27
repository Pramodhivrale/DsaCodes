package com.tricky;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Thalaivaa";
        String result = input.replaceAll("[aeiouAEIOU]", ""); // Remove vowels
        System.out.println(result);
    }
}

