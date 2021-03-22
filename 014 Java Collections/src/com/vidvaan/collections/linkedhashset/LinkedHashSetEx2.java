package com.vidvaan.collections.linkedhashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Red");
		arrayList.add("Yellow");
		arrayList.add("Orange");
		arrayList.add("Blue");
		arrayList.add("White");
		arrayList.add("Red");
		arrayList.add("Yellow");
		
		System.out.println(arrayList);
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
		
		System.out.println(linkedHashSet);
		
		System.out.println("Using For each loop");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
		
//		for (int i = 0; i < linkedHashSet.size(); i++) {
//			System.out.println(linkedHashSet.get(i));
//		}
		
		System.out.println("Using Iterator");
		Iterator<String> itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
