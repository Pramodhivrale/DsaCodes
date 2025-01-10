package com.revision;

public class Static {
	void meth1() {
		System.out.println("Non-static method");
	}

	static void meth2() {
		System.out.println("Satic method");
	}

	public static void main(String[] args) {
       Static s=null;
       //s.meth1();
       s.meth2();
	}
}
