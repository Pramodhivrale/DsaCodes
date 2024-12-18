package com.deadlock.in;

public class Thread1 extends Thread {
	Object obj1 = null;
	Object obj2 = null;

	public Thread1(Object o1, Object o2) {
		this.obj1 = o1;
		this.obj2 = o2;
	}

	@Override
	public void run() {
		synchronized (obj2) {
			System.out.println(Thread.currentThread().getName() + "Lock on object-2");
			System.out.println("Thread-2 want to acquerie lock on object-1");
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName() + "Lock on object-1");
			}
		}
	}
}
