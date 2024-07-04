package com.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreams 
{
	void meth1() throws Exception
	{
		System.out.println("Data Streams ");
		DataInputStream dis=new DataInputStream(new FileInputStream("C:\\FileInputStrem\\data4.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
		System.out.println("Reading is done..");
		dis.close();
	}
	void meth2() throws Exception
	{
		System.out.println("Data output Stream");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\FileInputStrem\\data4.txt"));
		dos.writeInt(5);
		dos.writeChar('A');
		System.out.println("done");
		dos.close();
	}
	public static void main(String[] args) throws Exception{
		DataStreams ds=new DataStreams();
		//ds.meth2();
		ds.meth1();
	}

}
