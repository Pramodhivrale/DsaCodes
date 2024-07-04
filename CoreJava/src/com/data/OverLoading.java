package com.data;

public class OverLoading 
{
	public void meth1() {
		
		System.out.println("Method 1 called");
	}
	
	public void meth1(int a) {
		System.out.println("Method 2 called :"+a);
	}
	
	public static void main(String[] args) 
	{
		OverLoading overrid=new OverLoading();
		overrid.meth1(10);
		
		
		
	}

}
