package com.vidvaan.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Naveen");
		linkedHashMap.put(3, "Lokesh");
		linkedHashMap.put(2, "Mounika");
		linkedHashMap.put(5, "Naresh");
		linkedHashMap.put(4, "Bhimesh");

		System.out.println(linkedHashMap);

		Set set = linkedHashMap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
