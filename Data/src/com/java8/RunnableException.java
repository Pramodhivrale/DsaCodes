package com.java8;

public class RunnableException 
{
	public static void main(String[] args) {
		Runnable task=()->{
			
			System.out.println("Run method exeuted");
			try {
			int a=11/0;
			}catch (Exception e) {
				e.getMessage();
				System.out.println("Exception handeled");
			}
			System.out.println("Run method ended");
		};
		
		Thread t=new Thread(task);
		t.start();
	}

}
