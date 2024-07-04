package com.data;

import java.io.PrintStream;

public class AnnoynomInnerClass 
{
	void meth1()
	{
		System.out.println("Outer class method");
		
	}
     public static void main(String[] args) {
		AnnoynomInnerClass aobj=new AnnoynomInnerClass()
		{
			@Override
			void meth1()
			{
				System.out.println("Annoynums inner class method");
				//super.meth1();
			}
		
		}
		;
		aobj.meth1();
		
	}	

}
