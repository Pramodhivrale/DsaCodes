package com.practice;

import java.math.BigInteger;

//To add two big integers we take input and store in String DataType and we use BigInt to store and add 

public class AddTwoLargeNumbers {
	public static void main(String[] args) {
      String num1="7896541236565652";
      String num2="85274196345689560";
      
      BigInteger n1=new BigInteger(num1);
      BigInteger n2=new BigInteger(num2);
      
      BigInteger bigInteger = n1.add(n2);
      System.out.println(bigInteger);
	}

}
