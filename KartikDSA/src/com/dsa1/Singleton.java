package com.dsa1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable {

	 static Singleton s = null;

	public static Singleton getInstance() {
		if (s == null) {
			return s=new Singleton();
		}
		return s;
	}

	private Singleton() {
      
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance.hashCode());
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2.hashCode());
		Singleton instance3 = Singleton.getInstance();
		System.out.println(instance3.hashCode());
		
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\pramod.ser"));
		obj.writeObject(instance);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\FileInputStrem\\\\pramod.ser"));
		Singleton s1=(Singleton)ois.readObject();
		System.out.println(s1.hashCode());
		
		
		
	}

}
