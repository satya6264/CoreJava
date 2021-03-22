package com.vidvaan.map.treemap;

import java.util.TreeMap;

public class TreeMapEx2 {
	
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("one", "Satya");
		treeMap.put("two", "Naresh");
		treeMap.put("three", "Harish");
		treeMap.put("four", "Suresh");
		treeMap.put("five", "Satya");
		treeMap.put("six", "Naresh");
		
		Object obj = treeMap.subMap("one", "three");
		
		System.out.println(treeMap);
		System.out.println(obj);
	}
	
	
}
