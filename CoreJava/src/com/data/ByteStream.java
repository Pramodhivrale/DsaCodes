package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream 
{
	void meth1() throws Exception
	{
		System.out.println("reading fata from file");
		FileInputStream fis=new FileInputStream("C:\\FileInputStrem\\This is javaaa.txt");
	    System.out.println("Connection crated");
		int i;
		while ((i=fis.read()) != -1) 
		{
			System.out.print((char)i);
			
		}
		System.out.println(i);
		System.out.println("Data Retrived...");
		fis.close();
	}
    void meth2() throws Exception
    {
    	System.out.println("Writing data into file....");
    	FileOutputStream fos=new FileOutputStream("C:\\FileinputStrem\\data.txt");
    	System.out.println("Connection created...");
    	String s="Java";
    	byte[] bytes = s.getBytes();
    	fos.write(bytes);
    	System.out.println("Data writing is completed..");
    	fos.close();
    }
	public static void main(String[] args) throws Exception
	{
		ByteStream b=new ByteStream();
		//b.meth1();
		
		b.meth2();
		
	}

}
