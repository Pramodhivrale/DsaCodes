package com.deadlock.in;

public class Thread2 extends Thread {

	Object obj1 = null;
	Object obj2 = null;

	public Thread2(Object o1, Object o2) {
		this.obj1 = o1;
		this.obj2 = o2;
	}

	@Override
	public void run() {
		synchronized (obj1) {
			System.out.println(Thread.currentThread().getName()+"Lock on object-1");
			System.out.println("Thread-1 want to acquerie lock on object-2");
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName()+"Lock on object-2");
			}
		}
	}
}
