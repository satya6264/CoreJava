package com.vidvaan.ArrayListSorting;

import java.util.*;

public class ArrayListAscendingAndDescendingOrder {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add(23);
		list.add(56);
		list.add(34);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new DescArrayList());
		System.out.println(list);
	}
}
