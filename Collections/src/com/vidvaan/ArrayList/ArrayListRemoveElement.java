package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveElement {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("Anil");
		list1.add("Balu");
		list1.add("Chari");
		list1.add("Durga");
		System.out.println("Before removing index 2 element : " + list1);

		list1.remove("Balu");
		System.out.println("After removing index 2 element : " + list1);

		list1.remove(0);
		System.out.println("After removing index 0: " + list1);

		List list2 = new ArrayList();
		list2.add("Ramesh");
		list2.add("Suresh");
		list2.addAll(list1);
		System.out.println("List2 : " + list2);
		System.out.println("After Adding list1 to list2 : " + list2);

		list2.removeAll(list1);
		System.out.println("After Removing list1 from list2 : " + list2);

		list2.clear();
		System.out.println("After invoking the clear method : " + list2);
	}
}
