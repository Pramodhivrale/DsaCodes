package com.dsa1;

public abstract class A {

	int a=100;
	public abstract void showA();
}
class B extends A{

	public static void main(String[] args) {
		A objA=new B();
		objA.showA();
	}

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}
	
}
