package com.vidvaan.Java7features;

public class MultipleExceptionExample1 {
	public static void main(String[] args) {
		try {
			int arry[] = new int[10];
			arry[10] = 30 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
