package com.thread;


//Approach-1
public class Thread1 implements Runnable 
{

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		
		Thread t=new Thread(t1);
		t.start();
	}

}
