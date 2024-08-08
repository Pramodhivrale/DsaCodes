package com.data;

public class MultiThreading {

	public static void main(String[] args) {
	
		Runnable r=()->{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		};
		
		Thread tr=new Thread(r);
		Thread t1=new Thread(r);
		
		tr.start();
		t1.start();
	}
	

}
