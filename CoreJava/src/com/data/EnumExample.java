package com.data;

import java.util.stream.Stream;

public enum EnumExample {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	
}

class EnumD{
	public static void main(String[] args) {
		Stream.of(EnumExample.values()).forEach(day->System.out.println(day+" "));
	}
}
