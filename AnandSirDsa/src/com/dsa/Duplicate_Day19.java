package com.dsa;

import java.util.ArrayList;

public class Duplicate_Day19 
{
	public static void main(String[] args) {
		
		int arr[]= {1000,1000,1000};
		int size=arr.length;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			int key=arr[i];
			int count=0;
			for(int j=i+1;j<size;j++) {
				if(arr[j]==key) {
					count++;
				}
			}
			if(count>0) {
				Boolean flag=true;
				for(int k=0;k<al.size();k++) {
					if(al.get(k).equals(key)) {
						flag=false;
					}
				}
				if(flag==true)
					System.out.println(key);
				al.add(key);
			}
		}
		
	}

}
