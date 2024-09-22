package com.data;

class Dogg{
	public void meth1() {
		System.out.println("Dog barked !");
	}
}
class Animall extends Dogg{

	@Override
	public void meth1() {
		super.meth1();
		System.out.println("Animal !");
	}
	
}
public class SuperKeyword 
{
	public static void main(String[] args) {
	Dogg d= new Animall();
	d.meth1();
	}

}
