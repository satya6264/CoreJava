package com.vidvaan.finallyblock;

public class FinallyBlockExample2 {

	public static void main(String[] args) {
		try {
			int a = 25 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Exception handeled");
		} finally {
			System.out.println("finally block executed");
		}
		System.out.println("rest of the code executed");
	}
}
