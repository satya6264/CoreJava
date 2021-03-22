package com.vidvaan.HashSet;

import java.util.HashSet;

import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Satya");
		set.add("Ravi");
		set.add("Mahesh");
		set.add("Naresh");
		set.add("Satya");
		System.out.println(set);
		set.remove("Naresh");
		System.out.println(set);
		System.out.println(set.getClass());
		Set set2 = new HashSet();
		set2.add(12);
		set2.add(34);
		set2.add(54);
		set2.add(65);
		set.addAll(set2);
		System.out.println(set);
		set.removeAll(set2);
		System.out.println(set);
		set.removeIf(str->((String) str).contains("Satya"));
		System.out.println(set);
		Set set3 = new HashSet(set);
		set3.add("Manju");
		System.out.println(set3);
		set3.clear();
		System.out.println(set3);
		
	}
}
