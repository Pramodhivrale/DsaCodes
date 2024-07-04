package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableClass implements Serializable {

	String name;
	String gender;
	
	@Override
	public String toString() {
		return "SerializableClass [name=" + name + ", gender=" + gender + "]";
	}

	
}

public class Seri 
{
	void meth1() throws Exception 
	{
		SerializableClass d1 = new SerializableClass();
		d1.name = "Pramod";
		d1.gender = "Male";

		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\output.ser"));
		oos.writeObject(d1);
		System.out.println("Object written file and seralization completed !");
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\FileInputStrem\\output.ser"));
        SerializableClass object =(SerializableClass) ois.readObject();
        System.out.println("Reading completed !"+object);
        ois.close();
        
		
		
	}

	public static void main(String[] args) throws Exception
	{
		
		new Seri().meth1();
	}

}
