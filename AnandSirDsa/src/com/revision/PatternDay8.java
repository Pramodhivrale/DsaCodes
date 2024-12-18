package com.revision;

//****
//***
//**
//*
public class PatternDay8 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 4+1-i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
