package com.vidvaan.finallyblock;

public class FinallyBlockExample1 {

	public static void main(String[] args) {
		try {
			int a = 25 / 5;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Exception not occured");
		} finally {
			System.out.println("finally block occured");
		}
		System.out.println("rest of the code");
	}

}
