package com.data;

class Data implements Cloneable{
	int i=1;
	String name="pramod";
	
	Data show() throws CloneNotSupportedException {
		Data clone =(Data) super.clone();
		return clone;
	}
}


public class ObjectClone 
{
	void meth1() throws CloneNotSupportedException {
		Data data=new Data();
		System.out.println(data.i+" "+data.name);
		
		Data shoe = data.show();
		shoe.name="data";
		System.out.println(shoe.name);
		
		
		
	}
	public static void main(String[] args) throws Exception {
		new ObjectClone().meth1();
	}

}
