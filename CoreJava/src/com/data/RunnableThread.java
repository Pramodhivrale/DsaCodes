package com.data;


public class RunnableThread implements Runnable 
{

	@Override
	public void run() 
	{
        for (int i = 0; i <=5; i++) 
        {
        	System.out.println("Run method is executed !"+i);
			
		}		
	}
	public static void main(String[] args)
	{
		RunnableThread aobj=new RunnableThread();
		Thread t=new Thread(aobj);
		t.start();
		//aobj.run();
		
	}
	

}
