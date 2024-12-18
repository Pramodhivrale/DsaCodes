package com.deadlock.in;

public class DeadLockExapmle {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread1 object1 = new Thread1(obj1, obj2);
		Thread2 object2 = new Thread2(obj1, obj2);

		object1.setName("T1");
		object2.setName("T2");

		object1.start();
		object2.start();
	}

}
