package com.data;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream 
{
	void meth1() throws IOException
	{
		System.out.println("reading fata from file");
		FileReader fis=new FileReader("C:\\FileInputStrem\\data.txt");
	    System.out.println("Connection crated");
		int i;
		while ((i=fis.read()) != -1) 
		{
			System.out.print((char)i);
			
		}
		System.out.println();
		System.out.println("Data Retrived...");
		fis.close();
	}
	void meth2() throws IOException {
		System.out.println("Writing data into file....");
    	FileWriter fos=new FileWriter("C:\\FileinputStrem\\data.txt");
    	System.out.println("Connection created...");
    	String s="Java";
    	fos.write(s);
    	System.out.println("Data writing is completed..");
    	fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		CharacterStream c=new CharacterStream();
		c.meth1();
		//c.meth2();
	}

}
