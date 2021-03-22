package com.vidvaan.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDescending {
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new HashMapComparator());
		map.put(101, "Satya");
		map.put(103, "Satya");
		map.put(102, "Satya");
		map.put(104, "Satya");
		map.put(105, "Satya");
		System.out.println(map);
	}

}
