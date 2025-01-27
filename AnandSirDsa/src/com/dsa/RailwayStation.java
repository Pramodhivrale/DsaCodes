package com.dsa;

import java.util.Arrays;

public class RailwayStation {
	public static void main(String[] args) {
		int[] arrival = { 1000, 1020, 1030, 1045, 1100, 1130 };
		int[] departure = { 1015, 1035, 1040, 1105, 1115, 1200 };

		int minPlatforms = findMinimumPlatforms(arrival, departure);
		System.out.println("Minimum number of platforms required: " + minPlatforms);
	}

	public static int findMinimumPlatforms(int[] arrival, int[] departure) {
		Arrays.sort(arrival);
		Arrays.sort(departure);

		int n = arrival.length;
		int platform = 1;
		int result = 1;

		// Pointers to track arrival and departure times
		int i = 1; // Pointer for arrival times
		int j = 0; // Pointer for departure times

		while (i < arrival.length && j < arrival.length) {
             if(arrival[i] <= departure[j]) {
            	 platform++;
            	 i++;
             }
             else {
				platform--;
				j++;
			}
             result=Math.max(result, platform);
             
		}
		return result;
	}

}
