package com.vidvaan.exceptions;

public class ExceptionEx2 {

	public static void m1() {
		System.out.println("This is m1 method");
	}

	public static void m2() {
		m1();
		System.out.println("This is m2 method");
	}

	public static void m3() {
		m2();
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("ArithmeticException invoked");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException invoked");
		} catch (Throwable e) {
			System.out.println("Trowable invoked");
		}
		System.out.println("This is m3 method");
	}

	public static void m4() {
		m3();
		System.out.println("This is m4 method");
	}

	public static void main(String[] args) {
		m4();

	}
}
