package com.java8;

public class MethodReferncing 
{
	void meth1()
	{

		//InterfaceA x=new MethodRefercing2()::display; //Non Static method refercing
			
        //InterfaceA x=MethodRefercing2::msg;// Static method refercing
        
        InterfaceA x=MethodRefercing2::new;
  
        
        
		x.meth1();
		
		
		
	}
	public static void main(String[] args) {
		new MethodReferncing().meth1();
	}

}
