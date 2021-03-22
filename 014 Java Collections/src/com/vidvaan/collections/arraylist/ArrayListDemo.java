package com.vidvaan.collections.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(24.50);
		arrayList.add(34.5f);
		arrayList.add("Satya");
		arrayList.add('s');
		arrayList.add('s');

		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		
//		arrayList.stream().forEach(n -> System.out.println(n));
	}

}
