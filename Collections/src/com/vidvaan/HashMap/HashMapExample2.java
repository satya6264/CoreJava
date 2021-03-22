package com.vidvaan.HashMap;

import java.util.HashMap;

public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put(101, "Satya");
		map.put(102, "Satya");
		map.put(104, "Satya");
		map.put(103, "Satya");
		map.put(101, "Satya");
		System.out.println(map);
	}

}
