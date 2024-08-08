package com.java8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDataJava8 
{
	public static void main(String[] args) {
		
		String filename="java.txt";
		
		try(Stream<String> file=Files.lines(Paths.get(filename))){
			file.forEach(list -> System.out.println(list));
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
