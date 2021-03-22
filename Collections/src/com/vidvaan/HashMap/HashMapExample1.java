package com.vidvaan.HashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(101, "Satya");
		map.put(102, "Naresh");
		map.put(103, "Srikanth");
		map.put(104, "Venkat");
		
		
//		Set entrySet = map.entrySet();
//		Iterator itr = entrySet.iterator();
//		while(itr.hasNext()) {
//			Entry entry = (Entry) itr.next();
//			System.out.println("Key : "+entry.getKey()+", Value : "+entry.getValue());
//		}
		
		Set keySet = map.keySet();
		Iterator keyitr = keySet.iterator();
		while(keyitr.hasNext()) {
			Integer key = (Integer) keyitr.next();
			System.out.println("Key : "+key+", Value : "+map.get(key));
		}
		
		
		System.out.println(map);
		
	}

}
