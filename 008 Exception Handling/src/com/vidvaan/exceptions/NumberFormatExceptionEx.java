package com.vidvaan.exceptions;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		try {
			String s = "abcd";
			int i = Integer.parseInt(s);
			System.out.println(i);

		} catch (NumberFormatException e) {
			System.out.println("Allows numerical valus only");
		}
		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
	}
}
