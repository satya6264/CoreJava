package com.vidvaan.collections.treeset;

import java.util.TreeSet;

public class TreeSetEx2 {
	
	public static void main(String[] args) {
		TreeSet<Double> treeSet = new TreeSet<>();
		treeSet.add(10.11);
		treeSet.add(10.13);
		treeSet.add(10.14);
		treeSet.add(10.12);
		treeSet.add(10.11);
		treeSet.add(10.15);
		
		System.out.println(treeSet);
	}

}
