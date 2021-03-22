package com.vidvaan.map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx1 {

	public static void main(String[] args) {
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
		sortedMap.put(1, "Satya");
		sortedMap.put(2, "harish");
		sortedMap.put(3, "naresh");
		sortedMap.put(4, "mahesh");
		sortedMap.put(5, "suresh");

		System.out.println(sortedMap);

		System.out.println("First key : " + sortedMap.firstKey());
		System.out.println("Last key : " + sortedMap.lastKey());
		System.out.println("Head map : " + sortedMap.headMap(3));
		System.out.println("Tail map : " + sortedMap.tailMap(3));
		System.out.println("Sub map : " + sortedMap.subMap(2, 4));
		System.out.println("Comaparator : " + sortedMap.comparator());

	}

}
