package com.ReflectionSingleton;

public class SingletonRefelection {
	static SingletonRefelection s = null;

	private SingletonRefelection() throws Exception {
      if(s != null) {
    	  throw new Exception("Second time object is not null");
      }
	}

	  static SingletonRefelection getInstance() throws Exception {
		if (s == null) {
			return s = new SingletonRefelection();

		}
		return s;
	}

}
