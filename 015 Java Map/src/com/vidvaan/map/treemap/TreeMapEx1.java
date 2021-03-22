package com.vidvaan.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		Map<Object, String> treeMap = new TreeMap<>();
//		treeMap.put(null, "null insertion");
		treeMap.put(2, "two");
		treeMap.put(4, "four");
		treeMap.put(1, "one");
		treeMap.put(5, "five");
		treeMap.put(3, "three");
		treeMap.put(7, "seven");
		treeMap.put(6, "six");
		treeMap.put(6, "six");

		System.out.println(treeMap);

	}

}
