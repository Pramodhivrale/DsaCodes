package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int key=arr[i];
			int count=0;
			
			for(int j=0;j<length;j++)
			{
				if(arr[j]==key)
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println("Unique Number :"+key);
			}
		}
		sc.close();
		
	}

}
