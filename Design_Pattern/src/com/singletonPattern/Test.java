package com.singletonPattern;

public class Test 
{
	public static void main(String[] args) {
		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance3 = SingletonDesignPattern.getInstance();
		
		System.err.println(instance3.hashCode());
		System.out.println(instance2.hashCode());
		System.err.println(instance.hashCode());
	}

}
