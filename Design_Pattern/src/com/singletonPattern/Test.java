package com.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test 
{
	public static void main(String[] args) throws Exception {
		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance3 = SingletonDesignPattern.getInstance();
		
		System.err.println(instance3.hashCode());
		System.out.println(instance2.hashCode());
		System.err.println(instance.hashCode());
		
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\pramod.ser"));
//		oos.writeObject(instance);
//		
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\FileInputStrem\\pramod.ser"));
//		SingletonDesignPattern s=(SingletonDesignPattern)ois.readObject();
//		System.out.println(s.hashCode()); // Singleton design pattern is broke using serialization
		
		Constructor<SingletonDesignPattern> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonDesignPattern newInstance =(SingletonDesignPattern) constructor.newInstance();
		System.out.println(newInstance.hashCode());  // Singleton design pattern is broke using reflection api
		

		
	}

}
