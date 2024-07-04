package com.data;

import java.util.Scanner;

public class Centimeter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in centimeter :");
		int centimeter = sc.nextInt();
		System.out.println("Length in meter :" + (centimeter * 0.01) + " m");
		System.out.println("Length in centimeter :" + (centimeter * 0.00001) + " km");
		sc.close();

	}

}
