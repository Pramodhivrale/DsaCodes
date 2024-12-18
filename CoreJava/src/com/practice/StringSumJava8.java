package com.practice;

public class StringSumJava8 
{
	public static void main(String[] args) {
		String number = "1234";
		int sum = number.chars().filter(Character::isDigit)
		.map(Character::getNumericValue).sum();
		System.out.println(sum);
	}

}
