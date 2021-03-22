package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(7);
		list.add("Satya");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		System.out.println(list.remove(4));
		System.out.println(list);
		System.out.println(list.iterator());
		System.out.println(list.listIterator());
		System.out.println(list.listIterator(4));
		System.out.println(list.parallelStream());
	}
}
