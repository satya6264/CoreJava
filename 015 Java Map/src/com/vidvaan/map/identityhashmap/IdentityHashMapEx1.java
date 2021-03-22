package com.vidvaan.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapEx1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		hashMap.put(i1, "satya");
		hashMap.put(i2, "harish");

		System.out.println("By using HashMap : " + hashMap);

		Map<Integer, String> identityHashMap = new IdentityHashMap<>();
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		identityHashMap.put(i3, "satya");
		identityHashMap.put(i4, "harish");

		System.out.println("By using IdentityHashmap : " + identityHashMap);

	}

}
