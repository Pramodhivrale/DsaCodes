package com.recurssion;

public class ReccursiveFibonanci 
{
	public static void main(String[] args) {
        int n = 10;  // Length of the Fibonacci series to generate
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to compute Fibonacci numbers
    public static int fibonacci(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
