package com.vidvaan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Satya");
		linkedList.add("Harish");
		linkedList.add("Naresh");
		linkedList.add("Veeru");
		linkedList.add("Jaggu");

		System.out.println(linkedList);

		linkedList.removeFirst();
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println(linkedList);

		linkedList.remove(1);
		System.out.println(linkedList);

		Iterator<String> itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
