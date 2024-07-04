package com.dsa;
/*
 * 153,370 is Armstrong number
 * 
 */
public class Armstorngnumber 
{
public static void main(String[] args) {
	int number=153;
	//int sum=0;
	int cubeAddition=0;
	while (number != 0) 
	{
		int r=number % 10;
		int cube=r*r*r;
		System.out.println("Cube of "+r+" is :"+cube);
		number =number / 10;
		cubeAddition =cubeAddition+cube;
		//sum=sum+r;	
	}
	//System.out.println(sum);
	System.out.println(cubeAddition);
    if (cubeAddition == 370) {
	System.out.println("This is armstrong number");	
	}
    else {
		System.out.println("This is not a armstrong number");
	}
}	

}
