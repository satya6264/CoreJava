package com.vidvaan.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListGetAndSearhElements {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Core java");
		list.add("Advanced java");
		list.add("Frame works");
		list.add("Project");
		list.add("Advanced java");


		System.out.println(list);
		
		System.out.println("First element : "+list.getFirst());
		
		System.out.println("Last element : "+list.getLast());
		
		System.out.println(list.get(0));
		
		System.out.println(list.indexOf("Advanced java"));
		
		System.out.println(list.lastIndexOf("Advanced java"));
		
		
		
		
	}

}
