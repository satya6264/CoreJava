package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetainAll {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Satya");
		list.add("Mahesh");
		list.add("Venu");
		list.add("Manju");
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add("Ravi");
		list2.add("Naresh");
		list.addAll(list2);
		System.out.println(list);
		list.retainAll(list2);  // Program not cleared
		System.out.println(list);
		
	}

}
