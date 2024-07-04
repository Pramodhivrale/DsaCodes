package com.data;

public class MaxNumberInArray 
{
	void meth1()
	{
		int arr[]= {5,4,52,7,45};
		//int max=0;
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		new MaxNumberInArray().meth1();
	}
   



}
