package com.vidvaan.exceptions;

public class ExceptionPractice {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
