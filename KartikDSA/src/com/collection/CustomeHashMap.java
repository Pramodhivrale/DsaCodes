package com.collection;

import java.util.ArrayList;

public class CustomeHashMap {
	static ArrayList<ArrayList<Integer>> list;
	static int size = 0;

	public CustomeHashMap(int size) {
		this.size = size;
		list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < size; i++) {
			list.add(new ArrayList<Integer>());
		}
		list.get(1);
	}

	CustomeHashMap() {

	}

	private int hashValue(int x) {
		int key = (h1(x) + h2(x)) % size;
		return key;
	}

	private int h2(int x) {

		return x % 10;
	}

	private int h1(int x) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
		}
		return sum % size;
	}

	public boolean search(int value) {
		int key = hashValue(value);
		ArrayList<Integer> al = list.get(key);
		return al.contains(value);
	}

	public void insert(int value) {
		int key = hashValue(value);
		ArrayList<Integer> al = list.get(key);
		if (!al.contains(value)) 
			al.add(value);
		
	}

	public static void main(String[] args) {
		CustomeHashMap map = new CustomeHashMap(10);
		map.insert(10);
		map.insert(10);
		map.insert(20);
		System.out.println(map.search(10));
		System.out.println(map);
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
