package com.vidvaan.LinkedList;

import java.util.*;

public class LinkedListExample1 {
	public static void main(String[] args) {
		List list = new LinkedList();
		System.out.println(list.isEmpty());
		list.add("Satya");
		list.add("Naresh");
		list.add("Raja");
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		list.add(1, "Mahesh");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(1, "Ravi");
		System.out.println(list);
		
		
		System.out.println(list.get(0));
		
		list.clear();
		System.out.println(list);
	}

}
