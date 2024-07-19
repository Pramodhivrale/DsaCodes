package com.singletonPattern;

public class SingletonDesignPattern 
{
    static SingletonDesignPattern s=null;
	
	private SingletonDesignPattern() {
		
	}
	
	static SingletonDesignPattern getInstance() {
		if(s==null) {
			return s=new SingletonDesignPattern();
		}else {
		return s;
		}
	}
	

}
