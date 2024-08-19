package com.data;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive int
        int primitiveInt = 10;

        // Convert primitive int to Integer (Boxing)
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);

        // Convert Integer back to primitive int (Unboxing)
        int unwrappedInt = wrappedInt.intValue();
        System.out.println("Unwrapped int: " + unwrappedInt);

        // Auto-boxing (Automatic conversion from primitive to wrapper)
        Integer autoBoxedInt = primitiveInt;
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);

        // Auto-unboxing (Automatic conversion from wrapper to primitive)
        int autoUnboxedInt = wrappedInt;
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        // Use of Wrapper Class Methods
        int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed int from String: " + parsedInt);

        String intToString = Integer.toString(primitiveInt);
        System.out.println("int to String: " + intToString);
    }
}

