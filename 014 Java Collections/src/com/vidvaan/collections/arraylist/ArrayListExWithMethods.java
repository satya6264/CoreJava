package com.vidvaan.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExWithMethods {

	public static void main(String[] args) {
		ArrayList javaCource = new ArrayList();

		System.out.println(javaCource.isEmpty());
		System.out.println(javaCource.size());

		javaCource.add("Core java");
		javaCource.add("Advanced java");
		javaCource.add("Frame works");

		System.out.println(javaCource);
		System.out.println(javaCource.isEmpty());
		System.out.println(javaCource.size());
		System.out.println(javaCource.contains("Core java"));

		if (javaCource.contains("Frame works")) {
			System.out.println("Frames works are : Hibernate, spring, springboot");
		} else {
			System.out.println("Data is invalid");
		}

		System.out.println(javaCource.get(0));
		
		javaCource.add(2, "Oracle database");
		System.out.println(javaCource);
		
		System.out.println(javaCource.indexOf("Oracle database"));

		System.out.println(javaCource.remove(0));
		System.out.println(javaCource);

		System.out.println(javaCource.remove("Oracle database"));
		System.out.println(javaCource);
		
		javaCource.clear();
		System.out.println(javaCource);

	}

}
