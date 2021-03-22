package com.vidvaan.oops.wrapperclasses;

public class WrapperAutoboxing {

	public static void main(String[] args) {
		int a = 10; // Primitive value
		Integer i = Integer.valueOf(a); // Converting int to Integer
		Integer j = a; // autoboxing

		System.out.println(a + " " + i + " " + j);
	}
}
