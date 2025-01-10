package com.ReflectionSingleton;

import java.lang.reflect.Constructor;

public class Test 
{
	public static void main(String[] args) throws Exception {
		SingletonRefelection s1= SingletonRefelection.getInstance();
		SingletonRefelection s2= SingletonRefelection.getInstance();
		SingletonRefelection s3= SingletonRefelection.getInstance();
		SingletonRefelection s4= SingletonRefelection.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		Constructor<SingletonRefelection> constructor = SingletonRefelection.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonRefelection newInstance =(SingletonRefelection) constructor.newInstance();
		System.out.println(newInstance.hashCode());
		
	}

}
