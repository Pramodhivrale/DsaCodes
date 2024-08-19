package com.data;

public class UserDefinedExceptionExample{

	public static void main(String[] args) {
		if(2 < 3) {
			throw new IllegalArgumentException("java");
		}
	}
}
