package com.data;

import java.util.Arrays;

public class ArrayQuestion 
{
	public int[] array(int arr[])
	{
		for (int i = 0; i <= arr.length-1; i++)
        {
        	if(arr[i]==2 && arr[1+i]==3)
        	{
        		arr[i+1]=0;
        	}
		}		
		return arr;
	}
	
	
	public static void main(String[] args)
	{
		int arr1[]= {2,3,8};
		ArrayQuestion aobj=new ArrayQuestion();
		int[] array = aobj.array(arr1);
		System.out.println(Arrays.toString(array));
		
        
	}

}
