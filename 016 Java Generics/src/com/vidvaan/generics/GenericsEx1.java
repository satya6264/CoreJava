package com.vidvaan.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx1 {

	public static void main(String[] args) {
		List list = new ArrayList(); // without generics.
		list.add(101);
		list.add("Satya");
		System.out.println(list);

		List<Integer> list1 = new ArrayList<>(); // with gererics.
		list1.add(101);
//		list1.add("Satya");//compile time error.
		System.out.println(list1);
	}
}
