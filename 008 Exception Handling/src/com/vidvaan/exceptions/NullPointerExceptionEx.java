package com.vidvaan.exceptions;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Null values are not allowed");
		}
		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
	}
}
