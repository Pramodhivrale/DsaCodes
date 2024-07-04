package in.codes;

import java.util.Scanner;

public class String 
{
		
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Use for loop with a counter for line number
		        for (int lineNumber = 1; sc.hasNextLine(); lineNumber++) {
		            java.lang.String line = sc.nextLine();
		            System.out.println(lineNumber + " " + line);
		        }

		        sc.close();
		 }

}
