package com.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		// Converting date to string
		SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
		String format = s.format(d);
		System.out.println(format);

		// Convert string to date
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-mm-dd");
		Date date = s1.parse("2024-8-4");

		System.out.println(date);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());

	}

}
