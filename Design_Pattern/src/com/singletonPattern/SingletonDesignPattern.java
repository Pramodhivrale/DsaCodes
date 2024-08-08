package com.singletonPattern;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable
{
    static SingletonDesignPattern s=null;
	
	private SingletonDesignPattern() throws Exception {
		if(s != null) {
			throw new Exception();
		}
	}
	
	static SingletonDesignPattern getInstance() throws Exception {
		if(s==null) {
			return s=new SingletonDesignPattern();
		}else {
		return s;
		}
	}
	
//	Object readResolve(){
//		return s;
//	}
	
	
	

}
