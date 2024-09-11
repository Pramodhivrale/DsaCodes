package com.data;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
	AtomicInteger counter = new AtomicInteger();

	public void increment() {
		counter.incrementAndGet();
	}

	public int getCount() {
		return counter.get();
	}

}
