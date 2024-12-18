package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class GenrateLargestNumber {
	public static void main(String[] args) {
		Integer input[] = { 8, 6, 0, 4, 6, 4, 2, 7 };
        Arrays.sort(input, Collections.reverseOrder());
        
        StringBuilder build=new StringBuilder();
        for(Integer number:input) {
        	build.append(number);
        }
        System.out.println(build);
	}

}
