package com.vidvaan.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIsEmpty {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("Satya");
		list.add("Nagaraj");
		list.add("Naresh");
		System.out.println(list.isEmpty());
		
	}

}
