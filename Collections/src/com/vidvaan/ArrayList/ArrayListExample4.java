package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("Satya");
		list1.add("Pranay");
		list1.add("Potti");
		list1.add("Kishore");
		System.out.println("Before adding : " + list1);

		list1.add(1, "Krish");
		System.out.println("After adding : " + list1);

		List list2 = new ArrayList();
		list2.add("Naresh");
		list2.add("Anwar");
		System.out.println("Before adding list : " + list2);

		list2.addAll(list1);
		System.out.println("After adding list : " + list2);

		List list3 = new ArrayList();
		list3.add("Ravi");
		list3.add("Suresh");
		list1.addAll(3, list3);
		System.out.println("After adding list3 at index 3 : " + list1);

		System.out.println("Removed index 1 element in list : " + list1.remove(1));
		System.out.println("After Removing index 1 in list : " + list1);
	}
}
