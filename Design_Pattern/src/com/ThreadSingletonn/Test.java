package com.ThreadSingletonn;

public class Test {

	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		Singleton s3= Singleton.getInstance();
		Singleton s4= Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
