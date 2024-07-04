package com.data;

import java.util.ArrayList;

public class MethodRefercing2 
{
	void display()
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		
		System.out.println(al);
	}
	static void msg() {
		System.out.println("Hello world...");
	}
	public MethodRefercing2() 
	{
		System.out.println("Constuctor called.......");
	}
	public static void main(String[] args) {
		new MethodRefercing2().display();
	}

}
