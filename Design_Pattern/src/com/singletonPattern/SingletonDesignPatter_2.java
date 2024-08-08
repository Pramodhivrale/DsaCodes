package com.singletonPattern;

import java.io.Serializable;

public class SingletonDesignPatter_2 implements Serializable,Cloneable
{
	
	static SingletonDesignPatter_2 s=null;
	
	private SingletonDesignPatter_2() throws Exception {
//		if(s != null) {
//			throw new Exception();
//		}
	}
	
	static SingletonDesignPatter_2 getInstance() throws Exception {
		
		if( s == null) {
		   return s=new SingletonDesignPatter_2();
		}
		else {
			return s;
		}
	}
	
//	Object readResolve() {
//		return s;
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return s; 
	}

}
