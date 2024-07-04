package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Ser implements Serializable
{
	int i=1;
	String name="pramod";
	
	
	
	
}

public class Serilazation 
{
	
	void meth1() throws Exception {
		
		Ser ser=new Ser();
		System.out.println(ser.i);
		
		
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\data.ser"));
		obj.writeObject(ser);
		obj.close();
		System.out.println("Object converted into file format");
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\FileInputStrem\\\\data.ser"));
		Ser object =(Ser) ois.readObject();
		ois.close();
		System.out.println(object.i+" "+object.name);
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		new Serilazation().meth1();
	}

}
