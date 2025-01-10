package com.ThreadSingletonn;

public class Singleton {
	static Singleton s = null;

	private Singleton() {

	}

	// By using thread we can broke singleton pattern but we can fix this
	// by making our getInstance method as synchronized
	static Singleton getInstance() {
		if (s == null) {
			synchronized (Singleton.class) {
				return s = new Singleton();
			}

		}
		return s;
	}

}
