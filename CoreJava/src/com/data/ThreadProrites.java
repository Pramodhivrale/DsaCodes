package com.data;

public class ThreadProrites implements Runnable
{
	
	@Override
	public void run()
	{
		String thread = Thread.currentThread().getName();
		for(int i=0;i<=5;i++)
		{
			System.out.println(thread+" has executed run ");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		ThreadProrites aobj=new ThreadProrites();
		
		Thread t=new Thread(aobj);
		Thread t1=new Thread(aobj);
		
		t.setName("First-Thread");
		t1.setName("Second-Thread");
		
		t.setPriority(10);
		t1.setPriority(1);
		t.start();
		t1.start();
	}

}
