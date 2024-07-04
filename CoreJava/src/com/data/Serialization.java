package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Serialization2 implements Serializable
{
	
	int a;
	String s;

}

public class Serialization 
{
	void meth1() throws Exception
	{
		Serialization2 s=new Serialization2();
		s.a=10;
		s.s="data";
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\data5.ser"));
		oos.writeObject(s);
		System.out.println("Object writing is completed");
		oos.close();
		
	
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\FileInputStrem\\data5.ser"));
		Serialization2 object =(Serialization2) ois.readObject();
		System.out.println(object.a+" "+object.s);
		System.out.println("Object reading is completed !");
		ois.close();
		
		
	}	
		
	public static void main(String[] args) throws Exception {
		Serialization serialization=new Serialization();
		serialization.meth1();
	}
	

}
