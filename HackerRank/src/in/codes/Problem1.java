package in.codes;

import java.util.Scanner;

public class Problem1 
{
	
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		
		int ans=a+b;
		
		for(int i=1;i<=n;i++) 
		{
			System.out.println(ans+" ");
			 ans=(int) (ans+Math.pow(2, i)* b);
			
		}
		System.out.println();
		sc.close();
	}
}
