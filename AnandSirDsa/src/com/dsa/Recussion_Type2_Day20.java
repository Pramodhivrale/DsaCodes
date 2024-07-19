package com.dsa;

public class Recussion_Type2_Day20 
{
	public static int power(int a, int b) {
        // Base case: Any number to the power of 0 is 1
        if (b == 0) {
            return 1;
        }
        // Recursive case: Multiply the base by the power of the base to b-1
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int result = power(5, 3);
        System.out.println(result); // Output will be 125
    }

}
