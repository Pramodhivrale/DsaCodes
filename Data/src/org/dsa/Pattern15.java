package org.dsa;

import java.util.Scanner;

public class Pattern15 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
	    int n=sc.nextInt();
	    int i=0;
	    for(int r=1;r<=n;r++) {
	    	for(int c=1;c<=r+i;c++) {
	    		System.out.print("*");
	    	}
	    	i++;
	    	System.out.println();
	    }
	    sc.close();
	}

}
