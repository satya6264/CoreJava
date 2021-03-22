package com.vidvaan.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListSubList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		list.add("Item 5");
		list.add("Item 6");
		list.add("Item 7");
		list.add("Item 8");

		System.out.println(list);

		Object subList = list.subList(1, 5);
		System.out.println(subList);
	}

}
