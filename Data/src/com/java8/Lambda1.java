package com.java8;

public class Lambda1 
{
	void show()
	{
		System.out.println("Implementing lambda experssion..");
//		 Lambda2 x=()->System.out.println("Hello world");
//		 x.meth1();
		
//		Lambda2 x=(a,b)->System.out.println(a+b);
//		x.meth2(10, 10);
		
		Lambda2 x=(a,b)->
		{
			if(a > 10) {
				System.out.println("a is grather than 10");
				return a;
			}
			else {
			    System.out.println("Else block is executed,,");
				return 1;
			}
			
		};
		int data = x.meth3(5, 5);
		System.out.println(data);
		
		
	}
	public static void main(String[] args) 
	{
      	new Lambda1().show();
	}

}
