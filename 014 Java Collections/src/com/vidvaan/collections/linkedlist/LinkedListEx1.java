package com.vidvaan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Satya");
		linkedList.add("Harish");
		linkedList.add("Veeru");
		linkedList.add(null);

		System.out.println(linkedList);

		linkedList.addFirst("Satya");
		linkedList.addLast("Jaggu");

		System.out.println(linkedList);

		linkedList.add(2, "Naresh");

		System.out.println(linkedList);

		Iterator<String> itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
