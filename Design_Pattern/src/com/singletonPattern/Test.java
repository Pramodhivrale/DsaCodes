package com.singletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance3 = SingletonDesignPattern.getInstance();
		
		System.err.println(instance3.hashCode());
		System.out.println(instance2.hashCode());
		System.err.println(instance.hashCode());
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\pramod.ser"));
		oos.writeObject(instance);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\FileInputStrem\\pramod.ser"));
		SingletonDesignPattern s=(SingletonDesignPattern)ois.readObject();
		System.out.println(s.hashCode());
	}

}
