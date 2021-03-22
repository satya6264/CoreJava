package com.vidvaan.collections.treeset;

import java.util.TreeSet;

public class TreeSetEx1 {
	
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(14);
		treeSet.add(23);
		treeSet.add(12);
		treeSet.add(22);
		treeSet.add(43);
		treeSet.add(23);
//		treeSet.add("hello");
		
		System.out.println(treeSet);
		System.out.println(treeSet.descendingSet());
		
	}

}
