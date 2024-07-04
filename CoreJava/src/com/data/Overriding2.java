package com.data;

public class Overriding2 extends OverLoading
{
	public void meth1() {
		System.out.println("Derived class method-1");
	}
	public static void main(String[] args) 
	{
		OverLoading overLoading=new Overriding2();
		overLoading.meth1();
	}

}
