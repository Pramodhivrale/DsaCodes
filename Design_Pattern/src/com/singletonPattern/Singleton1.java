package com.singletonPattern;

import java.io.Serializable;
// Seralization way to breake singleton
public class Singleton1 implements Serializable
{
	static Singleton1 obj=null;
	
	private Singleton1() {
		
	}
	
	static Singleton1 getInstance() {
		if(obj==null) {
			return obj=new Singleton1();
		}
		return obj;
	}
	
	// Adding these piece of code we can prevent singelton from breaking by seralization
	Object readResolve() {
		return obj;
	}

}
