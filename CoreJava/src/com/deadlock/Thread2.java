package com.deadlock;

public class Thread2 extends Thread {

	Object o1 = null;
	Object o2 = null;

	public Thread2(Object o1, Object o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {
		synchronized (o2) {
			System.out.println("Lock accqueried on object-2");
			System.out.println("Thread want to acqiuere lock on object-1");
			synchronized (o1) {
				System.out.println("Lock accqueried on object-1");
			}
		}

	}
}
