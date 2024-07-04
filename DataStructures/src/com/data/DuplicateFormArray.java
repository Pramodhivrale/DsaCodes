package com.data;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateFormArray 
{
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,80,10,40,20,1000,1000,1000};
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++) {
			int key=arr[i];
			int count=0;
			
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]==key) {
					count++;
					
				}
			}
			
			if(count>0) 
			{
				boolean flag=true;
				for(int a=0;a<=array.size()-1;a++) {
					if(array.get(a)==key) {
						flag=false;
						break;
					}
				}
				if(flag==true) {
					System.out.println(key);
					array.add(key);
					
				}
			}
		}
		sc.close();
	}

}
