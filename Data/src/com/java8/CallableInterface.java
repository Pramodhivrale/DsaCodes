package com.java8;

import java.util.concurrent.Callable;

public class CallableInterface{

	public static void main(String[] args) {
	
		Callable<Integer> cal=()->{
			int c= 10+10;
			return c;
		};
	}

}
