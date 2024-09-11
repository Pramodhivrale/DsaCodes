package com.dsa;

public class Subset 
{
	public static void main(String[] args) {
		int[] set= {8,5,2};
		
		int n=set.length;
		
		for(int i=0;i<(1 << n);i++) {
			String subset="";
			for(int j=0;j<n;j++) {
				if((i &(1 << j)) != 0) {
					subset=subset+set[j]+" ";
				}
			}
			System.out.println(subset);
		}
	}

}
