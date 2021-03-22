package com.vidvaan.collections.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Red");
		linkedHashSet.add("Blue");
		linkedHashSet.add("Yellow");
		linkedHashSet.add("Orange");
		linkedHashSet.add("White");
		linkedHashSet.add("Black");
		linkedHashSet.add("Red");
		linkedHashSet.add("Blue");
		linkedHashSet.add(null);

		System.out.println(linkedHashSet);
		
//		ArrayList<String> arrayList = new ArrayList<>(linkedHashSet);
//		System.out.println(arrayList);
	}

}
