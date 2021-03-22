package com.vidvaan.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Satya");
		list.add("Naresh");
		list.add("Anwar");
		list.add("Harish");

		System.out.println(list);

		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Using for each loop");
		for (String s : list) {
			System.out.println(s);

		}

		System.out.println("Using while loop");
		int count = 0;
		while (list.size() > count) {
			System.out.println(list.get(count));
			count++;
		}

		System.out.println("Using iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
