package com.vidvaan.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(100);
		set.add(200);
		set.add(400);
		set.add(300);
		set.add(400);
		set.add("Satya");
		System.out.println(set);
	}

}
