package com.vidvaan.ArrayList;

import java.util.*;

class ArrayListUsingIterator {
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add(12);
		list.add(23);
		list.add(34);
		list.add("Satya");
		list.add(null);
		System.out.println(list);
		Iterator itr = list.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}