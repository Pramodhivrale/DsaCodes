package com.dsa;

public class Power 
{
	public static void main(String[] args) {
		int ans=1;
		
		int a=2;
		int b=5;
		
		for(int i=1;i<=b;i++) {
			ans=ans * a;
		}
		System.out.println(ans);
	}

}