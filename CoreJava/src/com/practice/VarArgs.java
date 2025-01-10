package com.practice;

public class VarArgs 
{
	void meht1() {
		System.out.println(10+12);
	}
	public static void main(String ...datas) {
		VarArgs v=new VarArgs();
		v.meht1();
	}

}
