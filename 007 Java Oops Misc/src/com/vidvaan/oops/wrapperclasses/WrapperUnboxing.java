package com.vidvaan.oops.wrapperclasses;

public class WrapperUnboxing {

	public static void main(String[] args) {
		Integer a = new Integer(20); // Integer value
		int i = a.intValue(); // Converting Integer to int
		int j = a; // unboxing

		System.out.println(a + " " + i + " " + j);
	}
}
