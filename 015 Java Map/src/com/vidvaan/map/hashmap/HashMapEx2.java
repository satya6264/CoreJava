package com.vidvaan.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Satya");
		map.put(2, "Harish");
		map.put(3, "Suresh");
		map.put(4, "Naresh");
		map.put(5, "Srikanth");

		System.out.println(map);

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
