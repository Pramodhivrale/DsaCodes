package com.data;

public class InnerClass 
{
	void meth1()
	{
		System.out.println("Outer class method");
	}
	
	public InnerClass() 
	{
		System.out.println("outer class constructor");
	}
	static {
		System.out.println("Outer class static block");
	}
	class ClassA
	{
		void show()
		{
			System.out.println("Ineer class method");
			meth1();
		}
		public ClassA() {

			System.out.println("inner class construtor");
		}
		
	}
	
	public static void main(String[] args) 
	{
		InnerClass.ClassA aobj=new InnerClass().new ClassA();
		
	}

}
