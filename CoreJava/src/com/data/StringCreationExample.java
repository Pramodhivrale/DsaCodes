package com.data;

public class StringCreationExample {
    public static void main(String[] args) {
        // 1. Using String Literal
        String str1 = "Hello";
        System.out.println("String literal: " + str1);

        // 2. Using new Keyword
        String str2 = new String("Hello");
        System.out.println("Using new keyword: " + str2);

        // 3. Using char[] (Character Array)
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("Using char array: " + str3);

        // 4. Using byte[] (Byte Array)
        byte[] byteArray = {72, 101, 108, 108, 111};
        String str4 = new String(byteArray);
        System.out.println("Using byte array: " + str4);

        // 5. Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        String str5 = sb.toString();
        System.out.println("Using StringBuilder: " + str5);

        // 6. Using String.format()
        String str6 = String.format("Hello, %s!", "World");
        System.out.println("Using String.format(): " + str6);

        // 7. Using String.valueOf()
        int num = 123;
        String str7 = String.valueOf(num);
        System.out.println("Using String.valueOf(): " + str7);

        // 8. Using String.concat()
        String str8 = "Hello".concat(" World");
        System.out.println("Using String.concat(): " + str8);

        // 9. Using String.join()
        String str9 = String.join("-", "2024", "08", "14");
        System.out.println("Using String.join(): " + str9);

        // 10. Using String.copyValueOf()
        char[] charArray2 = {'J', 'a', 'v', 'a'};
        String str10 = String.copyValueOf(charArray2);
        System.out.println("Using String.copyValueOf(): " + str10);
    }
}
