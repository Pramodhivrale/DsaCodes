package com.pattern;

public class SingletonPattern 
{
	private static SingletonPattern singletonPattern;
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getObj() {
		
		if(singletonPattern == null) {
	      singletonPattern=new SingletonPattern();
		}
		return singletonPattern;
	}

}









