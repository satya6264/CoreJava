package com.vidvaan.TreeSet;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Comparator1 comp = new Comparator1();
		TreeSet set = new TreeSet(comp);
		set.add(34);
		set.add(23);
		set.add(56);
		set.add(2);
		System.out.println(set);
		
		
		
		
	}

}
