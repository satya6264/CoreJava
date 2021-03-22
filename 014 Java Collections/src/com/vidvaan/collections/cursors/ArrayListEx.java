package com.vidvaan.collections.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.add(10);
		System.out.println("Before iteration : " + arrayList);
//		Enumeration<Integer> enumeration = arrayList.Elements();  // Enumeration not supported
		ListIterator<Integer> litr = arrayList.listIterator(); // ListIterator is supported
		Iterator<Integer> itr = arrayList.iterator(); // Iterator is supported
		while (litr.hasNext()) {
			Integer i = litr.next();
//			if (i.equals(5)) {
//				itr.remove();
//			}
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				litr.remove();
			}
		}
		System.out.println("\n" + arrayList);
	}

}
