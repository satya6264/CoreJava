package com.vidvaan.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx3 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(null, "null insertion");
		lhm.put(101, "Ashish");
		lhm.put(103, "Bhimesh");
		lhm.put(102, "Naresh");
		lhm.put(104, "Govind");
		lhm.put(105, "Satya");
		lhm.put(105, "Satya");

		System.out.println(lhm);

		LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>();
		lhm2.put(106, "Ashish");
		lhm2.put(107, "Bhimesh");
		lhm2.put(108, "Naresh");
		lhm2.put(109, "Govind");
		lhm2.put(110, "Satya");
		lhm2.putAll(lhm);

		System.out.println(lhm2);
		for (Map.Entry<Integer, String> m : lhm2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
