package org.dsa;

import java.util.Scanner;

public class Matrixsum 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter column :");
		int c=sc.nextInt();
		System.out.println("Enter row no :");
		int r=sc.nextInt();
		
		int mat[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();			}
		}
		for(int i=0;i<r;i++)
		{
			
			int sum=0;
			for(int j=0;j<c;j++)
			{
			//System.out.print(mat[i][j]+" ");	
				sum=sum+mat[i][j];
			
			}
			System.out.println(sum);
		}
		sc.close();
		
	}

}
