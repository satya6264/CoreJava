package com.vidvaan.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1, "Satya");
		map.put(3, "Naresh");
		map.put(2, "Harish");
		map.put(4, "Anwar");

		System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
