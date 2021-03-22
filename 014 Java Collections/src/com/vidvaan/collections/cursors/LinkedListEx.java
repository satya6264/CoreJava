package com.vidvaan.collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);
		System.out.println("Before iteration : " + linkedList);

		ListIterator<Integer> litr = linkedList.listIterator();
		while (litr.hasNext()) {
			System.out.println("Forward Iteration : " + litr.next());
		}
		while (litr.hasPrevious()) {
			System.out.println("Backword Iteration : " + litr.previous());
		}
	}

}
