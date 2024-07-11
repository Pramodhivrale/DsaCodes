package com.data;

class Clone1 implements Cloneable{

	int i=1;
	String name="rutika";
	
   Clone1 show() throws CloneNotSupportedException {
	   Clone1 clone =(Clone1) super.clone();
	   return clone;
   }
}

public class ObjectClone1 
{
	void meth1() throws CloneNotSupportedException {
		
		Clone1 c=new Clone1();
		System.out.println(c.i+" "+c.name);
		
		Clone1 show = c.show();
		
		show.i=52;
		System.out.println(show.i+" "+show.name);
	}
	public static void main(String[] args) throws Exception{
		ObjectClone1 obj=new ObjectClone1();
		obj.meth1();
	}
	

}
