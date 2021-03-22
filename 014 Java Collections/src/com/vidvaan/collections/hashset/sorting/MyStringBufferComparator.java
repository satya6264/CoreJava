package com.vidvaan.collections.hashset.sorting;

import java.util.Comparator;

public class MyStringBufferComparator implements Comparator<SortingUsingStringBuffer>{

	@Override
	public int compare(SortingUsingStringBuffer o1, SortingUsingStringBuffer o2) {
		
//		return o1.toString().compareTo(o2.toString());
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}
