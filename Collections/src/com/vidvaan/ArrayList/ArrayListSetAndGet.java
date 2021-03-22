package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetAndGet {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Satya");
		list.add("Venu");
		list.add("Manju");
		System.out.println(list);
		System.out.println("Before adding index 1 : " + list.get(1));
//		list.add(list);
//		System.out.println(list);
		list.add(1, "Mahesh");
		System.out.println(list);
		System.out.println("After adding index 1 : " + list.get(1));
	}
}
