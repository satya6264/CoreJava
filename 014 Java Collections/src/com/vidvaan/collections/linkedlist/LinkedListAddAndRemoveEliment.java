package com.vidvaan.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListAddAndRemoveEliment {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Red");
		list.add("Yellow");
		list.add("White");
		list.add("Green");

		System.out.println(list);

		list.add("Blue");
		System.out.println(list);

		list.add(5, "Black");
		System.out.println(list);

		list.addFirst("First element");
		System.out.println(list);

		list.addLast("Last element");
		System.out.println(list);

		list.offerFirst("First offered");
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		list.remove("Red");
		System.out.println(list);

		list.clear();
		System.out.println(list);

	}

}
