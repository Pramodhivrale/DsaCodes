package com.dsa1;

public class PowerN 
{
	int power(int a,int n) {
		if(n==0) {
			return 1;
		}
		return a * power(a, n-1);
	}
	

}
