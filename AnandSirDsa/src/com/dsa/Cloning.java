package com.dsa;

class Clonee implements Cloneable{
	
	String name;
	int id;
	
	@Override
	protected Clonee clone() throws CloneNotSupportedException {
		
		return (Clonee) super.clone();
	}
	
}
public class Cloning 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Clonee c1=new Clonee();
		c1.name="pramod";
		c1.id=5;
		System.out.println(c1.name +" "+c1.id);
		
		Clonee clone = c1.clone();
		clone.name="rutu";
		System.out.println(clone.name+" "+clone.id);
	
		
	}

}
