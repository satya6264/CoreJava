package com.vidvaan.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExWithGenerics {

	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(new Integer(10));
		arrayList.add(new Double(24.23));
		arrayList.add(new Float(34.44f));
		arrayList.add(new String("Satya"));
		arrayList.add(new Character('s'));

		System.out.println(arrayList);
	}

}
