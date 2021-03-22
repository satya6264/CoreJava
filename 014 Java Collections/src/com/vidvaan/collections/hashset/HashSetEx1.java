package com.vidvaan.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Satya");
		hashSet.add("Narish");
		hashSet.add("Harish");
		hashSet.add("Anwar");
		hashSet.add("Ravi");
		hashSet.add("Satya");
		hashSet.add(null);
		hashSet.add(null);

		System.out.println(hashSet);

//		for (int i = 0; i < hashSet.size(); i++) {
//			System.out.println(hashSet.getClass());
//		}

		for (String string : hashSet) {
			System.out.println(string);
		}

//		int i =0;
//		while (hashSet.size()>i) {
//			System.out.println(hashSet.getClass());
//			i++;
//		}

		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
