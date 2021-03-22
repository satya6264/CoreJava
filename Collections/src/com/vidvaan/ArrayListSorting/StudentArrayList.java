package com.vidvaan.ArrayListSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student(102, "Ravi", 10000.00));
		list.add(new Student(101, "Satya", 10000.00));
		list.add(new Student(103, "Venkat", 10000.00));
		list.add(new Student(104, "Naresh", 10000.00));
		list.add(new Student(105, "Anil", 10000.00));
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		Collections.sort(list, new AsssComparater());
		for (Object s : list) {
			System.out.println(s);
		}
		
	}

}
