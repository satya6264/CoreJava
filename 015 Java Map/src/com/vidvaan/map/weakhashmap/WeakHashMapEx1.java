package com.vidvaan.map.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Using HashMap");
		HashMap<Temp, String> hashMap = new HashMap<>();
		Temp temp = new Temp();
		hashMap.put(temp, "Satya");
		System.out.println(hashMap);
		temp = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hashMap);

		System.out.println("Using WeakHashMap");
		WeakHashMap<Temp, String> weakHashMap = new WeakHashMap<>();
		Temp temp1 = new Temp();
		weakHashMap.put(temp, "Satya");
		System.out.println(hashMap);
		temp1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakHashMap);
	}

}
