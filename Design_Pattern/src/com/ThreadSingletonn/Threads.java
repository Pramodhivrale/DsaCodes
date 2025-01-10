package com.ThreadSingletonn;

public class Threads extends Thread {
	@Override
	public void run() {
		Singleton s5= Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		//System.out.println(Thread.currentThread().getName());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
	}

	public static void main(String[] args) {
		Threads obj1 = new Threads();
		Threads obj2 = new Threads();
		
		Thread t1=new Thread(obj1);
		t1.setName("Thread-1");
		
		Thread t2=new Thread(obj2);
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}
}
