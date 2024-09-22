package com.data;

class Clone implements Cloneable {

	int i;
	String name;

	public Clone(int i, String name) {
		this.i = i;
		this.name =name;
	}
	
	Clone show() throws CloneNotSupportedException 
	{
		Clone clone =(Clone) super.clone();
		return clone;	
	}
	

	

}

public class Clonig 
{
	void meth1() throws CloneNotSupportedException {
		Clone clone=new Clone(10, "Pramod");
		System.out.println(clone.i+" "+clone.name);
		
		Clone show = clone.show();
		show.name="Mahesh";
		System.out.println(show.i+" "+show.name);
		
	}
	public static void main(String[] args) throws Exception{
		new Clonig().meth1();
	}

}
