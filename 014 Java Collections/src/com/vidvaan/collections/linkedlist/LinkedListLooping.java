package com.vidvaan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLooping {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Satya");
		list.add("Naresh");
		list.add("Harish");
		list.add("Veeru");

		System.out.println(list);

		System.out.println("Iterating using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Iterating using for each loop");
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("Iterating using while loop");
		int i = 0;
		while (list.size() > i) {
			System.out.println(list.get(i));
			i++;
		}

		System.out.println("Iterating using Iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
