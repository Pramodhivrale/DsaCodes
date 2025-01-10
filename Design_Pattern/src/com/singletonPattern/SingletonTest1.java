package com.singletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		Singleton1 s3 = Singleton1.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:\\Design Pattern\\javaser.ser"));
		obj.writeObject(s1);

		ObjectInputStream oobj2 = new ObjectInputStream(new FileInputStream("D:\\\\Design Pattern\\\\javaser.ser"));
		Singleton1 s4 = (Singleton1) oobj2.readObject();
		System.out.println(s4.hashCode());

	}

}
