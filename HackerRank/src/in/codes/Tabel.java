package in.codes;

import java.util.Scanner;

public class Tabel 
{
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
		sc.close();
	}

}
