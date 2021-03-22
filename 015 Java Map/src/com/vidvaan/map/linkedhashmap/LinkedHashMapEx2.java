package com.vidvaan.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(101, "Ashish");
		linkedHashMap.put(103, "Bhimesh");
		linkedHashMap.put(102, "Naresh");
		linkedHashMap.put(104, "Govind");
		linkedHashMap.put(105, "Satya");

		System.out.println(linkedHashMap);

		for (Map.Entry<Integer, String> m : linkedHashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
