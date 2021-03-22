package com.vidvaan.exceptions;

public class StringIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		try {
			String s = "abcd";
			System.out.println(s.charAt(4));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of range: 4");
		}
		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
	}
}
