package in.codes;


import java.util.Scanner;

public class MathPawPr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the base 'a' and the exponent 'n'
        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        
        sc.close();
        
        // Calculate a^(n/2)
        double halfPower = Math.pow(a, n / 2);
        
        if (n % 2 == 0) {
            // When n is even, the result is (a^(n/2))^2 which is just a^n
            double power = halfPower * halfPower;
            System.out.println("The result of " + a + " to the power of " + n + " divided by 2 is: " + (int)power);
        } else {
            // Handle the case where n is odd
            System.out.println("The exponent n must be even.");
        }
    }
}
