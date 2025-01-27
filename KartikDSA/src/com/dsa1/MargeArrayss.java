package com.dsa1;

import java.util.Arrays;

public class MargeArrayss 
{
	public static void main(String[] args) {
		int a[] = { 8, 5, 6, 9, 30 };
		int b[] = { 7, 4, 5, 8, 2, 8 };
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1=0;
		int p2=0;
		int k=0;
		int result[] = new int[a.length + b.length];
		while (p1<a.length && p2<b.length) {
			if(a[p1] < b[p2]) {
				result[k]=a[p1];
				k++;
				p1++;
			}
			else{
				result[k]=b[p2];
				k++;
				p2++;
			}
		}
		while (p1 < a.length) {
			result[k]=a[p1];
			k++;
			p1++;
		}
		while(p2 < b.length) {
			result[k]=b[p2];
			k++;
			p2++;
		}
		
		System.out.println(Arrays.toString(result));
	}

}
