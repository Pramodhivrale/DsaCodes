package com.data;

interface InterfaceC {
	default void methodC() {
		System.out.println("Default implementation of methodC from InterfaceC");
	}
}

interface InterfaceD {
	default void methodC() {
		System.out.println("Default implementation of methodC from InterfaceD");
	}
}

class MyClass2 implements InterfaceC, InterfaceD {

	// Resolving methodC conflict by providing an implementation

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		InterfaceC.super.methodC(); // Call the method from InterfaceC
		InterfaceD.super.methodC(); // Call the method from InterfaceD
	}

}

public class MultipleInheritanceWithDefaultMethods {
	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		obj.methodC(); // Calls the overridden methodC in MyClass2
	}
}
