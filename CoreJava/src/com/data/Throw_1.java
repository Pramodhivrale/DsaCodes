package com.data;


public class Throw_1 
{
	void meth1() throws InvalidaValue {
		int a=2;
		if(a < 5) {
			throw new InvalidaValue("Exception");
		}
		else {
			System.out.println("No exception");
		}
	}
	public static void main(String[] args) throws InvalidaValue {
		new Throw_1().meth1();
	}

}
