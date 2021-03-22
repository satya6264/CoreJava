package com.vidvaan.exceptions;

public class ArithmeticExceptionEx {

	public static void main(String args[]) {
		System.out.println("Statementgt 1");
		System.out.println("Statementgt 2");
		System.out.println("Statementgt 3");
		try {
		System.out.println(100/0);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("can't devided by zero");
		}catch (NullPointerException e) {
			System.out.println("fgfgfgf");
		}catch (Throwable e) {
			System.out.println(e);
		}
		System.out.println("Statementgt 5");
		System.out.println("Statementgt 6");
		System.out.println("Statementgt 7");
		System.out.println("Statementgt 8");
		System.out.println("Statementgt 9");

	}

}
