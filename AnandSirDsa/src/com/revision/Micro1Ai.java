package com.revision;

import java.util.HashMap;
import java.util.Map;

public class Micro1Ai {
	public static void main(String[] args) {
		String[] input1 = { "15-03-2023", "21-03-2023", "15-05-2023", "22-05-2023", "01-03-2023" };
		int findrepetedmonth = findrepetedmonth(input1);
		System.out.println(findrepetedmonth);
	}

	public static int findrepetedmonth(String input[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (String data : input) {
			// int month = Integer.parseInt(data.split("-")[1]);
			String[] split = data.split("-");
			int month = Integer.parseInt(split[1]);

			map.put(month, map.getOrDefault(month, 0) + 1);
		}
		int maxCount = 0;
		int resultMonth = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer month = entry.getKey();
			Integer count = entry.getValue();

			if (count > maxCount) {
				maxCount = count;
				resultMonth = month;
			} else if (count == maxCount) {
				resultMonth = Math.min(resultMonth, month);
			}

		}
		return resultMonth;
	}

}
