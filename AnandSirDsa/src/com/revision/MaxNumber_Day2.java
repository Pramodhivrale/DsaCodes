package com.revision;

public class MaxNumber_Day2 
{
	void meth1()
	{
		int arr[]= {5,4,52,7,45};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(max < arr[i])//if(max > arr[i]) will give min number
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		new MaxNumber_Day2().meth1();
	}


}
